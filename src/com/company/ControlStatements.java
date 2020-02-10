package com.company;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {

//        create an object
        MyCase m1= new MyCase();
        m1.getInput(2);
        m1.checkIt();



        Scanner getSize = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int editorSize = getSize.nextInt();

        Scanner availability = new Scanner(System.in);
        System.out.print("Available/not: ");
        boolean avail = availability.nextBoolean();
//        check its compatibility

        if(avail) {
            if (editorSize > 40 && editorSize <= 60) {
                System.out.println("Compatible with windows");
            } else if (editorSize > 60 && editorSize <= 80) {
                System.out.println("compatible with linux");
            } else if (editorSize > 80 && editorSize <= 100) {
                System.out.println("Compatible with mac");
            } else {
                System.out.println("not compatible");
            }
        }
        else {
            System.out.println("Retry Later");
        }
    }
}

class MyCase{
    int input;
    void getInput(int input){
        this.input = input;

    }
    void checkIt(){
        switch (this.input){
            case 1:
                System.out.println("Add Cash");
                break;
            case 2:
                System.out.println("Withdraw cash");
                break;
            case 3:
                System.out.println("get statement");
                break;
            default:
                System.out.println("try later");
        }

    }
}