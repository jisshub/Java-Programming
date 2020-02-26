package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        StudentNames sn1 = new StudentNames();
        sn1.setLimit();
        sn1.setNames();
        sn1.getNames();
    }
}

class MyStudent{
    int limit;
    public void setLimit(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        limit = s1.nextInt();
    }
}
class StudentNames extends MyStudent {
    ArrayList<String> studList;

    public void setNames() {
        studList = new ArrayList<>();
        while (limit > 0) {
            Scanner name = new Scanner(System.in);
            System.out.println("Name: ");
            String studName = name.next();
            studList.add(studName);
            limit--;
        }
        System.out.println("Names List: " + studList.toString());
    }

    //    get student names starts with s
    public void getNames() {
        ArrayList<String> sArray = new ArrayList<>();
        ArrayList<String> notSArray = new ArrayList<>();
        String firstChar = "s";
        for (String eachName : studList
        ) {

            if (eachName.substring(0,1).equals(firstChar)) {
                sArray.add(eachName);
            }
            else {
                notSArray.add(eachName);
            }

        }
        System.out.println("Resultant Array: " + sArray.toString());
        System.out.println("Resultant Array: " + notSArray.toString());

    }
}

