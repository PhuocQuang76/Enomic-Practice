import com.example.model.Employee;
import com.example.model.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbcConfig.xml");

        System.out.println("\n---------------------------------");
        System.out.println("Register new Employee.");
        EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("dao");


        Employee employee = new Employee();
        int id = 10;
        employee.setId(id);
        employee.setDeptId(101);
        employee.setName("Aileen");
        employee.setSalary(2133.56);
        employee.setMgrId(4);
        int status=employeeDao.register(employee);
        if(status != 0){
            System.out.println(employee + " => was inserted successfully.");
        }else{
            System.out.println("Failed to insert a new record.");
        }

        System.out.println("\n---------------------------------");
        System.out.println("Find All Employee.");
        List<Employee> eList;
        eList = employeeDao.findAll();
        eList.forEach(e -> System.out.println(e));

        System.out.println("\n---------------------------------");
        System.out.println("Remove an Employee.");
        int id2 = 10;
        int returnV = employeeDao.remove(id2);
        if(returnV != 0){
            System.out.println( "Employee Id: " + id2 + " was removed successfully.");
        }else{
            System.out.println("Employee Id: " + id2 + " was fail to remove.");
        }

        System.out.println("\n---------------------------------");
        System.out.println("Find Employee By Id.");
        int id3 = 4;
        Optional<Employee> e = employeeDao.findById(id3);
        if(e != null){
            System.out.println(e);
        }else{
            System.out.println("Can not find the record.");
        }
    }
}