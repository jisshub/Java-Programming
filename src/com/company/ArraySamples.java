package com.company;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class ArraySamples {
    public static void main(String[] args) {
//        initialize an array
//        largest element in array
        int myArray2[] = {5, 6, 7, 1, 2};
        int j = 1;
        for (int i = 0; i < myArray2.length; i++) {

            if (myArray2[i] > myArray2[j]) {
                j++;
                System.out.println("Largest Element is: " + myArray2[j]);



            }

        }


//        second largest element
        int[] myArray4 = {5, 6, 7, 1, 2};





//        duplicate element
//        int myArray6[] = {5, 6, 7, 7, 1, 2};
//        int t = 1;
//        for (int i = 0; i < myArray6.length; i++) {
//
//            if (myArray6[i] == myArray6[t]) {
//                t++;
//                System.out.println("Duplicate Element is: " + myArray6[t]);
//
//
//
//            }
//
//        }




//        reverse an array
//        declare a new array
        System.out.println("** Array Reverse ***");
        int myArray[] = {5, 6, 7, 1, 2};
        for (int x = myArray.length; x >= 0; x--) {
            System.out.println(myArray[x - 1]);
        }


    }
}
