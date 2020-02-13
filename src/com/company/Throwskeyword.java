package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Throwskeyword {
    public static void main(String[] args) throws FileNotFoundException{
        MySecClass f1 = new MySecClass();
        f1.readSomeText();
        f1.getFile();
        f1.readFile();
    }
}

class MyFirstClass {
    File newFile;
    public void getFile(){
        newFile = new File("sample.txt");


    }

}
class MySecClass extends MyFirstClass{

    public void readFile() throws FileNotFoundException{
        //        read file
        Scanner eachLine = new Scanner(newFile) ;
        while (eachLine.hasNextLine()) {
            String data = eachLine.nextLine();
            System.out.println(data);
        }

    }
    public void readSomeText(){
        System.out.println("Edit here");
    }
}