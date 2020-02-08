package com.company;

public class MultipleInherit {
    public static void main(String[] args) {

    }
}

class Desktop{
    String size = "huge";
    boolean portable = false;

}
class Laptop{
    String size = "medium";
    boolean portable = true;
    boolean adapter = true;
}

//class Notebook extends Desktop, Laptop{
//
//}


//multiple inheritance not possible since child class cant extends multiple class