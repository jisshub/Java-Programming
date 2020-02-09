package com.company;

import java.util.Scanner;

public class FinalKeyword {
    public static void main(String[] args) {
        Unique uid = new Unique();
        uid.changeId();
        uid.addressInfo();
        uid.addressInfo(40);
    }
}
class Unique{
    final long aadharNo = 485734566789L;
    final String holderName = "Abin Jose";
    final byte age = 56;
//    static final variable
    static final int yearTaken;
    void changeId(){
//        we cant change the value of final variable once initialized
//        aadharNo = 8642343283L;
        String newLine = System.getProperty("line.separator");
        System.out.println("Aadhar NO: "+ aadharNo + newLine + "Name: "+ holderName
        + newLine + "Age: " + age + newLine + "Registered Year: " + yearTaken);
    }
//    static final variable r initialized in static block.
//    it is accessible anywhere in the declared class
    static {
        yearTaken = 2018;
    }

//    create a final method
    final void addressInfo(){
//        get house no
        Scanner hno = new Scanner(System.in);
        System.out.println("Enter House No: ");
        byte houseNo = hno.nextByte();
//        get house name
        Scanner hnm = new Scanner(System.in);
        System.out.println("Enter House Name: ");
        String houseName = hnm.next();
//        get pincode
        Scanner pn = new Scanner(System.in);
        System.out.println("Enter Pin No: ");
        int pinCode = pn.nextInt();
//      print all
        System.out.println(houseNo +" "+ houseName +" "+ pinCode);

    }

//    method overloading is possible for final method
    final void addressInfo(int a){
        System.out.println(a);
    }


}
//create a child class
//class NewUnique extends Unique{
//    final void addressInfo(){
//
//    }
//}

//here method overriding cant possible since final methods are final, no change afterwards.

//create a final class
final class DebitCard{
    String cardType = "master card";
    void printCard(){
        System.out.println(cardType);
    }
}
//
//class CreditCard extends DebitCard{
//
//}

//cant xtend a final class ie. inheritance is not allowed
