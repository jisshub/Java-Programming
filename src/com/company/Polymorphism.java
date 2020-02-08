package com.company;


class Sample{
    void add(int a, int b){
        System.out.println("Result: " + (a+b));
    }
    void add(String a, String b){
        System.out.println("Result: "+(a+" "+b));
    }
    void add(int a, int b, int c){
        System.out.println("Result: "+(a+b+c));
    }
    void add(){
        System.out.println("Result: "+true);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
//        create an instance of Sample class
        Sample s1 = new Sample();
//        function -1
        s1.add(4,5);
//        function -2
        s1.add("jissmon", "jose");
//        function -3
        s1.add(5,6,7);
//        function -4
        s1.add();
    }
}
