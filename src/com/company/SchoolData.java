package com.company;

import java.util.Scanner;

public class SchoolData {
    public static void main(String[] args) {
//        initialize a sports object
        Sports sp1 = new Sports();
        sp1.getSportsInfo("cricket", "football", "hockey");
        sp1.getStudentInfo("adharsh", 6, 10);
        sp1.checkStudentAge();
    }

}

class School{
    String schooName;
    float monthlyFee;

    public void getSchoolInfo(String sname, float fee){
        this.schooName = sname;
        this.monthlyFee = fee;

    }

}

class StudentData extends School{
    String studName;
    int studClass ,age;
    public void getStudentInfo(String sname, int stud_class, int age){
        this.studName = sname;
        this.studClass = stud_class;
        this.age = age;
    }
}

class Sports extends StudentData{
    String item1, item2, item3;
    public void getSportsInfo(String item1, String item2, String item3){
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;


    }
    public void checkStudentAge(){
        if (this.age > 14){
            System.out.println("Can Participate in" + this.item1 + "," + this.item2 + "," + this.item3);
        }
        else {
            System.out.println("Can Participate in " + this.item1 + " ," +this.item2);

        }
    }

}