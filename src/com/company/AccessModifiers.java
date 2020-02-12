package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AccessModifiers {
    public static void main(String[] args) {

    }
}

class Fruits{
    public String fruitName = "Mango";
    private int fruitPrice = 45;
    String tasteType = "bitter";
    String fruitColor = "dark yellow";
    protected String fruitSeason = "march";


    public void FruitPrice(){
//can access the private with in the same class
        System.out.println(fruitPrice);
    }

//    can access the protected with in the same class
    public void FruitSeason(){
        System.out.println(fruitSeason);
    }
}

class MyfavFruits extends Fruits{
    public void getFruitName(){
        System.out.println(fruitName);
    }
    public void getFruitPrice(){
//        System.out.println(fruitPrice);
//        cant access the variable fruitPrice since it is declared as private
    }
//    define a default method
    void getTasteType(){
        System.out.println(tasteType);
//        can access since it is default
    }
    private void getFruitColor(){
        System.out.println(fruitColor);
    }
    protected void getFruitSeason(){
        System.out.println(fruitSeason);
    }

}
class HisFavFruit extends MyfavFruits{
    public void getAll(){
        getFruitName();
        getFruitPrice();
        getTasteType();
        FruitPrice();

//        can access the protected method.
        getFruitSeason();

//        but cant access getFruitColor() since it is private method


    }
}