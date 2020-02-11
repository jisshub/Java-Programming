package com.company;

public class JumpStatements {
    public static void main(String[] args) {
//        break statement
        int x = 10;
        for (int i = 0; i < x; i++) {
            if (i == 6) {
                break;
//              break the loop and exit.
            }
            else {
                System.out.println("value: " + i);
            }
        }

//        example -2
        String names[] = new String[]{"adharsh", "june", "nayans"};
        for (int i = 0; i < names.length ; i++) {
            if (names[i].equals("june")){
                break;
            }
            else {
                System.out.println("Name: " + names[i]);
            }
        }


//      continue statement
        System.out.println("***Continue Statement ***");
        int j = 10;
        for (int i = 0; i < j ; i++) {
            if (i == 5){
                continue;
//                continue back to the for loop
            }
            else {
                System.out.println("value: "+ i);
            }
        }

//        example -3
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("june")){
                continue;
            }
            else {
                System.out.println("Name: " + names[i]);
            }
        }
    }
}
