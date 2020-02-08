package com.company;

import java.util.concurrent.ExecutionException;

public class TypeCasting {
    public static void main(String[] args) {
//        automatic type casting
//        converting byte to int
        byte rollNo = 32;
        int newRoll = rollNo;
        System.out.println(newRoll);
//        check whether an integer type.
//        converting int to long
        int registerNo = 6788;
        long registerNO = registerNo;
        System.out.println(registerNO);

//        narrowing type casting
//        long  -> byte
        long ssn = 342342424L;
        int ssnNew = (int) ssn;
        System.out.println(ssnNew);

//        long -> int
        long myId = 394723233343433L;
        int newmyId = (int) myId;
        System.out.println(newmyId);

//        string -> int
        String rank ="45";
//convert to int and verify it
        try{

            int a  = Integer.parseInt(rank);
            System.out.println(a + " is an inetger");
        }
        catch (Exception e) {
            System.out.println("Not an int");
        }
        finally {
            System.out.println("try aor catch executed ");
        }

//        example - 2
//        string -> float
        String marks = "45.50";
        try
        {
            float a = Float.parseFloat(marks);
            System.out.println(a+ " is a float value");
        }
        catch (Exception e){
            System.out.println("not a float");
        }
        finally {
            System.out.println("try/catch executed");
        }


    }
}
