package com.company;

class Computers{
//    declare instance variables
    String model;
    float price;
    float screensize;
//    DEFINE A STATIC VARIABLE/class variable
    String brand = "ASUS";

    // define a function and declare local variables as parameters
    void compData(String cmp_model, float cmp_price, float screen_size){
        model = cmp_model;
        price = cmp_price;
        screensize = screen_size;
    }
    void showData(){
        String newLine = System.getProperty("line.separator");
        System.out.println("Model: "+  model + newLine + "Price: "+price + newLine + "ScreenSize: " + screensize +
                newLine + "Brand: " + brand);
    }

}
public class Variables {
    public static void main(String[] args) {
        Computers cmp1 = new Computers();
        cmp1.compData("hp pavilion", 28000.65f, 15.5f);
        cmp1.showData();
    }
}
