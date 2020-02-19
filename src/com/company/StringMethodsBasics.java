package com.company;

import java.util.Arrays;

public class StringMethodsBasics {
    public static void main(String[] args) {
//        string conactenation
        String name= "jissmon";
        String status = "online";
        System.out.println(name + "is" + status);
//        String comparison
//        equals
        String result = "Passed";
        String result1 = "Passed";
        if (result.equals(result1)){
            System.out.println("Same");
        }
//        equalIgnorecase
        String course = "degree";
        String newCourse = "DEGREE";
        if (course.equalsIgnoreCase(newCourse)){
            System.out.println("IGNORE THE CASES");
        }
//        substring
        String deptName = "Furniture";
        String subValue = deptName.substring(6);
        System.out.println(subValue);

//        touppercase
        System.out.println(course.toUpperCase());
//        tolowercase
        System.out.println(newCourse.toLowerCase());
//      to charArray
      char[] myNewArray = deptName.toCharArray();
      System.out.println("Resultant Array:"+ Arrays.toString(myNewArray));
//      Split Method
        String Info = "The course not good";
//        give a regex in which the string is to be splitted up on.
        String[] splitedArray = Info.split(" ");
        System.out.println("Resultant Array: "+ Arrays.toString(splitedArray));
//        trim method
        String details = "   train is late   ";
        System.out.println(details.trim());
//        replace method

        String replaceString = "machire";
        String replacedString = replaceString.replace("r", "n");
        System.out.println(replacedString);

//        startwith()
        System.out.println("jss".startsWith("j"));
//        endswith()
        System.out.println("mahcine".endsWith("d"));
//        contains
        System.out.println("terminator".contains("r"));
        System.out.println("prithviraj".contains("vi"));



    }
}
