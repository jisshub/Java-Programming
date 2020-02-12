package com.company;

public class Encapsulation {
    public static void main(String[] args) {
        EmployeeData ed = new EmployeeData();
//        invoke setters
        ed.setEmpName();
        ed.setEmpID();
        ed.setEmpDept();

//        invoke getters
        ed.getEmpName();
        ed.getEmpID();
        ed.getEmpDept();
    }
}

class EmployeeData{
//    declare 3 private variables
    private String empName;
    private int empID;
    private String empDept;

//    define public method and set values to each private variable.
//    SETTERS
    public void setEmpName(){
        empName = "Jissmon";
    }
    public void setEmpID(){
        empID = 4566;
    }
    public void setEmpDept(){
        empDept = "Tools";
    }

//    GETTERS
//    get values from private variables
    public void getEmpName(){
        System.out.println("Employee Name: "+ empName);
    }
    public void getEmpID(){
        System.out.println("Employee Id: " + empID);
    }
    public void getEmpDept(){
        System.out.println("Employee Dept: " + empDept);
    }

}
