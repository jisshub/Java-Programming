package com.company;

public class thisKeyword {
    public static void main(String[] args) {
//        define an object
        MyHealth mh1 = new MyHealth();
        MyHealth mh2 = new MyHealth();


        mh1.getHealthInfo("60bpm", "140/30mm", 350, 145);
        mh1.printInfo();
        mh2.getHealthInfo("80bpm", "110/60mm", 250, 245);
        mh2.printInfo();

//
    }
}

class MyHealth{
//    declare instance variables,
    String heartRate, bpLevel;
    int sugarLevel, cholestrolLevel;

    void getHealthInfo(String heartRate, String bpLevel, int sugarLevel , int cholestrolLevel){
//        using this to refer to current object
        this.heartRate = heartRate;
        this.bpLevel = bpLevel;
        this.sugarLevel = sugarLevel;
        this.cholestrolLevel = cholestrolLevel;

    }
    void printInfo(){
        System.out.println(this.heartRate + this.bpLevel + this.sugarLevel + this.cholestrolLevel);
    }

}

//this keyword shud be used if v provide same variable name for instance and parameters