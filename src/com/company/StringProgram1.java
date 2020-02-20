package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StringProgram1 {
    public static void main(String[] args) {
//        duplicate character in a string
        Scanner myString = new Scanner(System.in);
        System.out.println("Enter Department: ");
        String deptName = myString.next();
//      convert string to array types.
        char[] charArr = deptName.toCharArray();
        System.out.println(Arrays.toString(charArr));

//        create an array here
        char[] duplicateAray = new char[10];

//        give conditions
        for (int i = 0; i <charArr.length ; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]){
                    System.out.println("Duplicate Character: " + charArr[i]);
                    for (int k = 0; k != duplicateAray.length ; k++) {
                        duplicateAray[i] = charArr[i];
                    }
                }
            }

        }
        System.out.println(Arrays.toString(duplicateAray));


    }
}
