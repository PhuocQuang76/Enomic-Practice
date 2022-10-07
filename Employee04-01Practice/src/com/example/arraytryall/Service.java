package com.example.arraytryall;

public class Service {
    public static int search(int[] array, int searchNum) {
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(searchNum == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] insertNumberToArray(int[] array, int insertNum){
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
            newArray[array.length] = insertNum;
        }
        return newArray;
    }

    public static int[] reserveArray(int[] array){
        int[] reverseArray = new int[array.length];
        int n = 0;
        for(int i = array.length -1; i >= 0; i--){
            reverseArray[n] = array[i];
            n++;
        }
        return reverseArray;
    }

    public static int findMin(int[] array){
        int temp = 0;
        int min = array[0];
        for(int i = 1 ; i < array.length; i++){
            if(min > array[i]){
                temp = min;
                min = array[i];
                array[i] = temp;
            }
        }
        return min;
    }


    public static int findMax(int[] array){
        int max = 0;
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                temp = max;
                max = array[i];
                array[i] = max;
            }
        }
        return max;
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] newArray = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            newArray[i] = arr1[i];

        }
        for(int n = 0; n < arr2.length; n++){
            newArray[arr1.length + n] = arr2[n];
        }
        return newArray;
    }


    public static int[] removeElement(int[] arr, int removeNum){
        int[] newArray = new int[arr.length -1];
        for(int i = 0,k = 0; i < arr.length; i++){
            if(arr[i] != removeNum){
                newArray[k] = arr[i];
                k++;
            }
        }
        return newArray;
    }

    //Remove An Array from another array
//    public static int[] removeAnArray(int[] arr, int[] removeArr){
//
//        int[] newArray = new int[arr.length - removeArr.length];
//
//    }
}
