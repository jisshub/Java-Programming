package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofObjects {
    public static void main(String[] args) {

//        create an object of Smartphone.
        SmartPhone p1 = new SmartPhone();
//        invoke the function using it.
        p1.phoneFunc();


    }
}

class SmartPhone{
//  instance variables
    String model ,ipRating;
    float price;

//  initialize an array of type smartphone
    SmartPhone[] phones = new SmartPhone[2];

//  create three scanner object

    Scanner modelVal = new Scanner(System.in);
    Scanner ipVal = new Scanner(System.in);
    Scanner priceVal = new Scanner(System.in);

    //    iterate through array

    public void phoneFunc(){
        for (int i = 0; i < phones.length ; i++) {

            //initialize an object of Smartphone
            SmartPhone smart1 = new SmartPhone();

            //call each instance variable and store values
            System.out.print("Enter Model: ");
            smart1.model = modelVal.next();

            System.out.print("Enter Ip Rating: ");
            smart1.ipRating = ipVal.next();

            System.out.print("Enter Price: ");
            smart1.price = priceVal.nextFloat();

            // assign the smartphone object to array object
            phones[i] = smart1;
            System.out.println("");

            // get each properties of object
            System.out.println(smart1.model);
            System.out.println(smart1.ipRating);
            System.out.println(smart1.price);
        }
        System.out.println("Resultant Array: "+ Arrays.toString(phones));

    }
}