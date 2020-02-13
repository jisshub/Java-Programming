package com.company;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("username: ");
        String myUserName = s1.next();
        Scanner s2 = new Scanner(System.in);
        System.out.println("password: ");
        int myPassword = s2.nextInt();

        if(myUserName.equals("jissmon") && myPassword == 45637){
            System.out.println("Welcome" + myUserName);
        }
        else {
            throw new InvalidParameterException("Invalid Credentials");
        }

    }
}
