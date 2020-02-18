package com.company;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Name:");
//            initialize a string
        String name = s1.next();
//        convert the string to character array
        char[] nameArray = name.toCharArray();
        System.out.println(nameArray.length);
        for (int i = 0; i < nameArray.length ; i++) {
            for (int j = i + 1; j < nameArray.length ; j++) {
                if(nameArray[i] == nameArray[j]){
                    System.out.println("Duplicate Character: "+ nameArray[i]);

                }
            }
        }
    }
}
