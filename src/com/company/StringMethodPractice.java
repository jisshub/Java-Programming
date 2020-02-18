package com.company;

import java.util.Arrays;

public class StringMethodPractice {
    public static void main(String[] args) {
//        largest sentence in paragaph
        String paragraph = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String[] array1 = paragraph.split("\\.");

        for (String each: array1
             ) {
             String new1 = each.replace(" ", ",");

            System.out.println(each.length());
        }

    }
}
