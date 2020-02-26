package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayObjects{
    public static void main(String[] args) {
        AllStudents obj = new AllStudents();
        obj.StudFunction();
        obj.getEachStudData();
    }
}
class StudentArrays{
//    create an ArrayList of students
    ArrayList<StudentArrays> studObj = new ArrayList<>();

    //    declare an instance variables
    String studName;
    int studAge;
    int studAdmNo;

//    create scanner objects
    Scanner Sname = new Scanner(System.in);
    Scanner Sage = new Scanner(System.in);
    Scanner Sno = new Scanner(System.in);
}
class NewStudents extends StudentArrays{
//    set a limit for iteration
    int totalLimit = 3;
    public void StudFunction(){
        for (int i = 0; i < totalLimit ; i++) {
//            create an object of StudentArrays
            StudentArrays myStud1 =  new StudentArrays();
            System.out.println("Student Name: ");
            myStud1.studName = Sname.next();
            System.out.println("Student Age: ");
            myStud1.studAge = Sage.nextInt();
            System.out.println("Student Admission No: ");
            myStud1.studAdmNo = Sno.nextInt();

//            assign object to ArrayList object
            studObj.add(myStud1);
        }
//        print array
        System.out.println("Resultant Array: " + studObj.toString());
    }
}

class AllStudents extends NewStudents{
    String newLine = System.getProperty("line.separator");
    public void getEachStudData(){
        int i = 1;
        for (StudentArrays eachObj: studObj
             ) {
            System.out.println("****Student"+i+"****");
            i ++;
            System.out.println("Name: " + eachObj.studName + newLine + "Age: " + eachObj.studAge + newLine + "Admission No: " + eachObj.studAdmNo);
        }
    }
}
