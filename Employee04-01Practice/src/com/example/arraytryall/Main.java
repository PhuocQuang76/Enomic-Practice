package com.example.arraytryall;

import java.util.Arrays;

import static com.example.arraytryall.Service.*;

public class Main {
    public static void main(String[] args) {
        int[] myNumber1 = {1,5,2,10,4,5,7};

        int[] myNumber2 = {12,3,4,5,1,14,6};

        //1. Sort an array and search an element inside it.
        System.out.println("Sort an array and search an element inside it.");
        Arrays.sort(myNumber1);
        for(int num:myNumber1){
            System.out.print(num + "\t");
        }

        int index = search(myNumber1, 10);
        if(index == -1){
            System.out.println("\nCan not find the number. ");
        }else{
            System.out.println("\nThe number is at index: " + index);
        }



        //2. Insert ann element inside an array.

        System.out.println("\nInsert ann element inside an array.");
        int[] arr = insertNumberToArray(myNumber1, 30);
        for(int num : arr){
            System.out.print(num + "\t");
        }


        //Reverse an array
        System.out.println("\n\nReverse an array.");
        int[] reserve = reserveArray(myNumber1);
        for(int num : reserve){
            System.out.print(num + "\t");
        }

        //find minimum number in an array
        System.out.println("\n\nFind minimum number in an array.");
        int min = findMin(myNumber1);
        System.out.print(min);

        //Find maximum number in an array
        System.out.println("\n\nFind maximum number in an array.");
        int max = findMax(myNumber1);
        System.out.print(max);


        //Merge 2 arrays
        System.out.println("\n\nMerge 2 arrays.");
        int[] mergeArr = merge(myNumber1, myNumber2);
        for(int num : mergeArr){
            System.out.print(num + "\t");
        }


        //Remove an element in an array
        System.out.println("\n\nRemove an element in an array.");
        int[] removeArr = removeElement(myNumber1, 10);
        for(int num : removeArr){
            System.out.print(num + "\t");
        }
    }
}
