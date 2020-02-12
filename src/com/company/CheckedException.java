package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        try {

            File f1 = new File("sample.txt");

//            try to read the file using scanner
            Scanner readME = new Scanner(f1);
            while (readME.hasNextLine()){
                String data = readME.nextLine();
                System.out.println(data);
            }
//            close the scanner object
//            readME.close();
        }

//        catch the file not found exception
        catch (FileNotFoundException e){
            System.out.println("An error occurred");
//            to show the exception details use printStacktrace on exception object
//            e.printStackTrace();
        }

    }
}
