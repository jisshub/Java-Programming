package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofObjects2 {
    public static void main(String[] args) {
        Departments d1 = new Departments();
        d1.deptFunc();


    }
}

class Departments{
    String deptName;
    int totalEmployees;
    float totalSalaries;

//    instantiate a department array object
    Departments[] deptArray = new Departments[3];

//    declare scanner object
    Scanner name = new Scanner(System.in);
    Scanner employees = new Scanner(System.in);
    Scanner salaries = new Scanner(System.in);
    
    public void deptFunc(){
        for (int i = 0; i < deptArray.length; i++) {
            Departments dept1 = new Departments();
            System.out.println("Enter Department Name: ");
            dept1.deptName = name.next();
            System.out.println("Enter Total Count of Employees: ");
            dept1.totalEmployees = employees.nextInt();
            System.out.println("Enter Total Salaries Spent: ");
            dept1.totalSalaries = salaries.nextFloat();
            deptArray[i] = dept1;
            System.out.println("");

            System.out.println(dept1.deptName);
            System.out.println(dept1.totalEmployees);
            System.out.println(dept1.totalSalaries);
        }
        System.out.println("Resultant Array: "+ Arrays.toString(deptArray));
    }

}
