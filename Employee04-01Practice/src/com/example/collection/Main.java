package com.example.collection;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //create Set elements for objects A holding values 1, 4, 5, 4, 6, 8, 10, 8
        // print and check if it skips duplicate or not.
        // if not ----take the help of hashcode & equals to help Set to ignore duplicate.
        //print again and see if only unique is printed.
        //               [1,4,5,6,8,10]

        Set<A> setA = new HashSet<>();
        setA.add(new A(1));
        setA.add(new A(4));
        setA.add(new A(5));
        setA.add(new A(4));
        setA.add(new A(6));
        setA.add(new A(8));
        setA.add(new A(10));
        setA.add(new A(8));

        for(A num : setA){
            System.out.println(num + "\t");
        }


    }
}
