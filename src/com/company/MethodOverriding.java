package com.company;

public class MethodOverriding {
    public static void main(String[] args) {
//    create an instance of SampleChild class
        SampleChild sc = new SampleChild();
        sc.addition();
        sc.getAccount(83726);
    }
}
class Sample11{
    void addition(){
        System.out.println(8+10);
    }

    void getAccount(int accountNo){
        System.out.println("My Account No. "+ accountNo);
    }

}

class SampleChild extends Sample11{
    void addition(){
        System.out.println("addition of child class object");
        System.out.println("jiss" + "jose");

//        below v access the function of parent class using super keyword
//        from child class function
        System.out.println("adddition of parent class object");
        super.addition();


    }
    void getAccount(int accountNo){
        System.out.println("My New Account no. "+ accountNo);
        super.getAccount(534543);
    }
}