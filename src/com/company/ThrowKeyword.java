package com.company;

import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner myAge = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int hisAge = myAge.nextInt();

        if(hisAge < 18){
            throw new ArithmeticException("Invalid Age Given");
//            here v careate an arithmetic execption incase age is below 18
        }
        else{
            System.out.println("Can apply for Driving License");
        }
    }
}


