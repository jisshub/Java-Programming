package com.company;

public class StringHandling {
    public static void main(String[] args) {
//        intialising a string
        String s = "hello";
        String obj1 = new String("myname");
        System.out.println("String1:" + s);
        System.out.println("String2:" + obj1);

//        string is immutable
        String s1 = "jissmon";
        s1 = "Ajith";
        System.out.println("Modified Name:" + s1);

//        here value of s1 is stored in string pool at heap.
//        initialvalue is jissmon, and memory is alloacted for that value.
//        when v reassign the value Ajith to s1, previusl allocated allocated
//        memory for s1 is not replaced. but a new memory for s1 is added and Ajith
//        is alloacted t htat memory. not the memory where jissmon is allocated.
//        then s1 points to the new memory.
//        hence it prints the value 'Ajith'. it doesnt replace the value 'jissmon', instead it creates a
//        new memory allocation for value 'Ajith'. That's all.
    }
}
