package com.company;

import java.util.Date;

public class StaticMethodNew {
    public static void main(String[] args) {
//        first static method
        ElectronicShop.eachItems("mobile", 348723.66f);
//        second static method
        ElectronicShop.eachItems(5, "12-03-2020");
//        third static method
        ElectronicShop.eachItem();

    }
}
class ElectronicShop{
    static void eachItems(String itemName, float itemPrice){
        String newLine = System.getProperty("line.separator");
        System.out.println("Item Name: " + itemName + newLine + "Item Price: "+ itemPrice);
    }
    static void eachItems(int itemQuantity, String expiryDate){
        String newLine = System.getProperty("line.separator");
        System.out.println("Item Quantity: " + itemQuantity + newLine + "Expiry Date: "+ expiryDate);
    }
    static void eachItem(){
        System.out.println("***Stock Not Available***");
    }

}




// static method overloading is possible in java