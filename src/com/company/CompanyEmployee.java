package com.company;

public class CompanyEmployee{
    public static void main(String[] args) {
//
        Employee emp1 = new Employee();
        emp1.companyInfo("camerinfolks", "medium");
        emp1.employeeInfo("Jacob", 56000.44f);
        emp1.printEmployee();

        Department dept1 = new Department();
        dept1.companyInfo("camerinfolks", "medium");
        dept1.DeptInfo("Testing", "QA Analyst");
        dept1.printDept();

    }
}

class Company{
    String cname, type;
    public void companyInfo(String comp_name, String comp_type){
        this.cname = comp_name;
        this.type = comp_type;
    }
}
class Employee extends Company{
    String empName;
    float salary;
    public void employeeInfo(String empName, float salary) {
        this.empName = empName;
        this.salary = salary;
    }
    public void printEmployee(){
        System.out.println(this.cname + " "+ this.type +" "+ this.empName + " "+ this.salary);

    }

}

class Department extends Company {
    String DName, Designation;

    public void DeptInfo(String DName, String Designation) {
        this.DName = DName;
        this.Designation = Designation;
    }

    public void printDept(){
        System.out.println(this.cname + " "+ this.type +" "+ this.DName + " "+ this.Designation);

    }
 }
