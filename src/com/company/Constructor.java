package com.company;

public class Constructor {
    public static void main(String[] args) {
//        create object.
//        here v pass parameter to the constructor while object initialization
        Student stud = new Student(45, 55);
        stud.getDta();
    }

}

class Student{
//    create a Student constructor
    int val1, val2;
    Student(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }
//    define a normal method
    void getDta(){
        System.out.println("Result: "+ (this.val1+this.val2));
    }
}




//constructor is inovked whole object initiliazation.
