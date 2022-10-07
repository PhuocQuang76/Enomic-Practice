package com.example.employee.domain;

import com.example.employee.business.EmployeeStockPlan;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);

        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        //eng.printEmployee();

        System.out.println(eng);

        //adm.printEmployee();
        System.out.println(adm);

        //mgr.printEmployee();
        mgr.toString();

        //dir.printEmployee();
        System.out.println(dir);

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        //mgr.printEmployee();
        System.out.println(mgr);


        EmployeeStockPlan esp = new EmployeeStockPlan();

        System.out.println("\n*********** Engineer ***********");
        System.out.println("\tEmployee Type:    " + eng.getClass().getSimpleName());
        printEmployee(eng, esp);

        System.out.println("\n*********** Admin ***********");
        System.out.println("\tEmployee Type:    " + adm.getClass().getSimpleName());
        printEmployee(adm, esp);

        System.out.println("\n*********** Manager ***********");
        System.out.println("\tEmployee Type:    " + mgr.getClass().getSimpleName());
        printEmployee(mgr, esp);

        System.out.println("\n*********** Director ***********");
        System.out.println("\tEmployee Type:    " + dir.getClass().getSimpleName());
        printEmployee(dir, esp);

        System.out.println("\n****** Testing raiseSalary and setName on Manager: ********");
        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        //mgr.printEmployee();
        printEmployee(mgr, esp);

    }

    public static void printEmployee(Employee emp){
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("\tStock Options:    " + esp.grantStock(emp));
    }
}

