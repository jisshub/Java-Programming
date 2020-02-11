package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        declaring and instantiating an array object of integer type
        int[] registerNO = new int[5];

//        iteration on an array to store items
        Scanner eachItem = new Scanner(System.in);
        for (int i = 0; i < registerNO.length; i++) {
            System.out.print("Value: ");
            int arrItem = eachItem.nextInt();
            registerNO[i] = arrItem;
        }
        System.out.println("Resultant Array: " + java.util.Arrays.toString(registerNO));

//        iteration on array to get each items
        int t = 1;
        for (int j = 0; j < registerNO.length; j++) {
            System.out.println("value" + t + ":" + registerNO[j]);
            t++;
        }


//    iteration on array using forEach
        String[] names = {"jissmon" , "aju", "don", "avrin"};
        int g = 1;
        for (String eachVal: names
             ) {
            System.out.println("Name"+ g + ":" + eachVal);
            g++;

        }

//        instantiating a string array
        String[] rmPlayers = new String[4];
//        create a scanner object
        Scanner eachPLayer = new Scanner(System.in);
        for (int y = 0; y < rmPlayers.length; y ++){
            System.out.print("Enter player: ");
            String playerNames = eachPLayer.next();
            rmPlayers[y] = playerNames;
        }
        System.out.println("Player Names: "+ java.util.Arrays.toString(rmPlayers));

    }
}
