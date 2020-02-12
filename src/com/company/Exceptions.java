package com.company;

import java.util.Arrays;

public class Exceptions {
    public static void main(String[] args) {

//            initialize an array
        int[] myArray = new int[4];
        String data = null;
        try
        {
            myArray[0] = 78;
            myArray[1]= 56;
//            array index out of bound
            myArray[8] = 100;
//            null pointer
            System.out.println(data.length());

        }
        catch (Exception e){
//
            myArray[2] = 44;
            myArray[3] = 87;
            System.out.println("Resultant Array: "+ Arrays.toString(myArray));
            System.out.println("Exception Object: " + e);
        }

        finally {
            System.out.println("Execute Always");
        }

    }
}

