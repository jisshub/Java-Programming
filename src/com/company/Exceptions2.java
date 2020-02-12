package com.company;

import java.util.Arrays;

public class Exceptions2 {
    public static void main(String[] args) {
//        initialize an array
        String[] names = new String[4];
        String name = null;

//        using specific exception cases
        try{
            names[0] = "jissmon";
            names[1] = "akhil";
//            storing value to an index that exceeds the actual length of array
            names[5] = "don";

        }

        catch (ArrayIndexOutOfBoundsException e1){
            names[2] = "justin";
            names[3] = "manoj";
            System.out.println("Resultant Array: " + Arrays.toString(names));
        }


    }
}
