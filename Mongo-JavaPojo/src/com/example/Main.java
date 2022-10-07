package com.example;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeException;
import com.example.dao.EmployeeFactory;
import com.example.pojos.Employee;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.List;

public class Main {

    public static void main(String[] args)  {
        EmployeeDao dao = EmployeeFactory.get();

        Employee employee = new Employee(3,"Alex", 25000,102);

        System.out.println("\nRegister an employee into the database:");
        try {
            String mes = dao.register(employee);
            System.out.println(mes);
        } catch (EmployeeException e) {
            e.printStackTrace();
        }

        System.out.println("\nFind All employee in the database:");
        List<Employee> eList;
        try {
            eList = dao.findAll();
            eList.forEach(e -> {System.out.println(e);});
        } catch (EmployeeException e) {
            e.printStackTrace();
        }


        System.out.println("\nFind employee by Id from the database:");
        Employee e = null;
        try {
            e = dao.findById(3);
            System.out.println(e);
        } catch (EmployeeException ex) {
            ex.printStackTrace();
        }


        System.out.println("\nRemove employee by Id from the database:");
        try {
            int value = dao.remove(5);
            if(value != 0) {
                System.out.println("Record was removed successfully !");
            }else{
                System.out.println("Can not find the record !");
            }
        } catch (EmployeeException ex) {
            ex.printStackTrace();
        }


        System.out.println("\nUpdate an employee record from the database:");
        Employee emp = new Employee(4,"Micheal", 25000,103);
        try{
            String returnV = dao.update(emp);
            System.out.println(returnV);
        } catch (EmployeeException ex) {
            ex.printStackTrace();
        }
    }
}
