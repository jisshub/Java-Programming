package com.company;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        getMyHashes getObj1 = new getMyHashes();
        getObj1.getStudentInfo();
        getObj1.getAllStudents();
    }
}

class MyHashMaps{

    //    create a hashmap for students
    HashMap<Integer, MyHashMaps> hmap = new HashMap<>();

    // declare instance variables,
    String studentName;
    int studentAge, studentRegNo;
    float studentMarks;

    // create scanner objects
    Scanner sname = new Scanner(System.in);
    Scanner sage = new Scanner(System.in);
    Scanner smark = new Scanner(System.in);
    Scanner register = new Scanner(System.in);

    public void getStudentInfo(){
        int totalStudents = 2;
        for (int i = 0; i < totalStudents ; i++) {
            MyHashMaps m1 = new MyHashMaps();
            System.out.println("Student name: ");
            studentName = sname.next();
            System.out.println("Student age: ");
            studentAge = sage.nextInt();
            System.out.println("Student mark: ");
            studentMarks = smark.nextFloat();
            System.out.println("Student register No: ");
            studentRegNo = register.nextInt();

//            put the register no and object to hashmap object
            hmap.put(studentRegNo, m1);

        }
    }
}

class getMyHashes extends MyHashMaps{
    public void getAllStudents(){
//        iterate thru each student data in hashmaps
        for (Map.Entry<Integer, MyHashMaps> entry: hmap.entrySet()
             ) {
//            get the key and value
            int key = entry.getKey();
            MyHashMaps value = entry.getValue();
//            print all info's
            System.out.println("Register No: "+ key + " Student Name: "+ value.studentName + "Student Age: " + value.studentAge
            + "Student Marks: " + value.studentMarks);



        }
//        or use below forEach.

//        hmap.forEach((key, value) -> System.out.println(key + " " + value.studentName + " " + value.studentAge +" " + value.studentMarks));
    }
}