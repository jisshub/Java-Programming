package com.company;

import java.util.Arrays;

public class ConstructorOverloading {
    public static void main(String[] args) {

//        constructor - 1
        Editor ed1 = new Editor("vscode", "30mb");
//        constructor - 2
        Editor ed2 = new Editor("linux, windows, mac");
//        constructor - 3
        Editor ed3 = new Editor();
    }
}

class Editor{
    String name, size;
    String platforms;
    Editor(String name, String size){
        this.name = name;
        this.size = size;
        System.out.println(this.name + " " +this.size);
    }
    Editor(String platforms){
        this.platforms =platforms;
        System.out.println(this.platforms);

    }
    Editor(){
        System.out.println("Good Editor");

    }

}

//constructor overloading is satisfied

