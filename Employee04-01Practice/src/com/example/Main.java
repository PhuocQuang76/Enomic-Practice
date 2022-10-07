package com.example;


import com.example.products.Clothing;
import com.example.products.Footwear;
import com.example.products.Returnable;
import com.example.products.misc.*;

import static com.example.singleton.PeerSingleton.getInstance;

public class Main {

    //object interface practice

    public static void returnPolicy(Returnable r){
        r.doReturn();
    }

    public static void showDetail(Clothing c) {
        c.print();
        if(c instanceof Shirt) {
            returnPolicy((Returnable)c);
        }
    }


    public static void showDetail(Footwear f) {
        f.print();
        if(f instanceof Flats || f instanceof Sandals) {
            returnPolicy((Returnable)f);
        }
    }


    public static void main(String[] args) {


        byte b = (byte) 200;
        System.out.println(b);


        Clothing[] cloths= {
                new Shirt(1, "Levis-TShirt", 5, 10, 40),
                new CustomShirt(4,"Custom Shirt-Cust1",20,2),
                new Shirt(2, "US-POLO-shirt", 8, 10, 38),
                new CustomShirt(5,"Custom Shirt-Cust2",22,1),
                new Shirt(3, "Adidas-Denim", 15, 10, 44),


        };
        Footwear[] footwears= {
                new Flats(101, "C-1001", 10.21, 10),
                new Flats(102, "C-1002", 11.56, 5),

                new Boots(103,"B-1200",23.50,4,false),
                new Boots(104,"B-1201",23.50,4,true),

                new Sandals(105,"D-1400", 40.50, 6, true),
                new Sandals(105, "D-1500", 30.00,7,false),
        };
        for(Clothing c:cloths) {
            showDetail(c);
        }
        System.out.println("*************Footwear************");

        for(Footwear f:footwears) {
            showDetail(f);
        }



        //Employee01-01 Practice
       /*
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


        */


    }

}
