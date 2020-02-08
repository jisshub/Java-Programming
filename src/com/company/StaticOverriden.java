package com.company;

public class StaticOverriden {
    public static void main(String[] args) {
//        MyRoom.roomDetails();
        ChildRoom.roomDetails();
        MyRoom.roomDetails();



    }
}

class MyRoom{
    static void roomDetails(){
        System.out.println("Room has 2 windows");
    }
}
class ChildRoom extends MyRoom{
    static void roomDetails(){
        System.out.println("Room has 3 windows");
    }
        }