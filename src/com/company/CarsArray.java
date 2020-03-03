package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CarsArray {
    public static void main(String[] args) {
        MyCarsArray c1 = new MyCarsArray();
        c1.carsFirst();
    }
}
class MyCarsArray{
    public void carsFirst(){
        ArrayList<String> carsList = new ArrayList<>();
        Scanner sizeLimit = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int carsSize = sizeLimit.nextInt();
        while(carsSize > 0){
            Scanner enterCar = new Scanner(System.in);
            System.out.println("Enter Car: ");
            String carName = enterCar.next();
            carsList.add(carName);
            carsSize --;
        }
        System.out.println("Cars List:" + carsList.toString());
    }
//    iterating thru array list

}
