package com.company;

public class Interface {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.add();
        d1.multiply();
        d1.getValue();
        d1.getNewValue();
    }
}
interface Innerdemo{
    String name ="Jissmon";

    void add();
    void multiply();
    void getValue();
}

interface OuterDemo{
    int ticketno = 473436;

    void getNewValue();
}

class Derived implements Innerdemo,OuterDemo{
    public void add(){
        System.out.println(5+6);
    }
    public void multiply(){
        System.out.println(5*6);
    }
    public void getValue(){
        System.out.println("name:"+ name);
    }
    public void getNewValue() {
        System.out.println("Ticket: "+ ticketno);
    }
}

//here child class implement both the interfaces which
//is not possible in multiple inheritance