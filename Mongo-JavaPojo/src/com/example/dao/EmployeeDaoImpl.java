package com.example.dao;

import com.example.pojos.Employee;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class EmployeeDaoImpl implements EmployeeDao {
    MongoClient mongo = MongoClients.create("mongodb://127.0.0.1:27017");
    MongoDatabase database = mongo.getDatabase("java-our-soul");
    MongoCollection<Document> collection = database.getCollection("employee");

    FindIterable<Document> iterDoc = collection.find();

    @Override
    public List<Employee> findAll() throws EmployeeException {
        List<Employee> empList = new ArrayList<>();
        MongoCursor<Document> it = iterDoc.iterator();

        while(it.hasNext()){
            Document d = it.next();
            String name=d.getString("name");
            int id = d.getInteger("empid");
            int salary = d.getInteger("salary");
            int departmentId = d.getInteger("deptId");

            empList.add(new Employee(id,name,salary,departmentId));
        }
        return empList;
    }


    @Override
    public String register(Employee emp) throws EmployeeException {
        int registerId = emp.getId();
        String message = "";
        boolean check = false;
        MongoCursor<Document> it = iterDoc.iterator();
        while(it.hasNext()) {
            Document d = it.next();
            if (d.getInteger("empid") == registerId) {
                message = "Id nnumber " + registerId + " is already existed. Try with another Id.";
                check = true;
                break;
            }
        }
        if(!check){
            Document doc = new Document();
            doc.append("empid", emp.getId());
            doc.append("name", emp.getName());
            doc.append("salary", emp.getSalary());
            doc.append("deptId", emp.getDeptId());
            collection.insertOne(doc);
            System.out.println(doc);
            message = "Document inserted successfully !";
        }

        return message;
    }

    @Override
    public Employee findById(int searchId) throws EmployeeException {
        Employee e = null;
        MongoCursor<Document> it = iterDoc.iterator();
        while(it.hasNext()){
            Document d = it.next();
            int id = d.getInteger("empid");
            if(id == searchId){
                String name = d.getString("name");
                int salary = d.getInteger("salary");
                int departmentId = d.getInteger("deptId");
                e = new Employee(id,name,salary,departmentId);
                break;
            }

        }
        return e;
    }

    @Override
    public int remove(int id) throws EmployeeException {
        int returnV = 0;
        MongoCursor<Document> it = iterDoc.iterator();
        while(it.hasNext()) {
            Document d = it.next();
            if (d.getInteger("empid") == id) {
                collection.deleteOne(d);
                returnV = id;
                break;
            }
        }
        return returnV;
    }

//    @Override
//    public int remove(int id) throws EmployeeException {
//
//        collection.deleteOne(Filters.eq("empid",id));
//        System.out.println("Document deleted successfully...");
//        return id;
//    }

    @Override
    public String update(Employee e) throws EmployeeException{
        String message = "";

        Document query = new Document().append("empid",  e.getId());

        Bson updates = Updates.combine(
                Updates.set("name", e.getName()),
                Updates.set("salary", e.getSalary()),
                Updates.set("deptId", e.getDeptId()),
                Updates.currentTimestamp("lastUpdated"));
        UpdateOptions options = new UpdateOptions().upsert(true);
        try {
            UpdateResult result = collection.updateOne(query, updates, options);

            System.out.println("Modified document count: " + result.getModifiedCount());

        } catch (MongoException me) {
            System.err.println("Unable to update due to an error: " + me);
        }
        return message;
    }

}
