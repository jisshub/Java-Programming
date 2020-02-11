package com.company;

public class IterationalStatements {
    public static void main(String[] args) {
//        declare and allocate memory to array
        int[] marks = new int[]{34, 45, 66, 11, 56, 98, 100};
//        forEach loop statement
        for (int val1 : marks
        ) {
            System.out.println("Marks: " + val1);
        }
//        example -2
        String[] names = new String[]{"jissmon", "george", "akhil", "abin"};
        for (String eachName : names
        ) {
            System.out.println("Each Name: " + eachName);

        }

//        example -4
        float[] price = new float[]{13.55f, 66.77f, 66.88f, 392472.33f};
        for (float itemPrice : price
        ) {
            System.out.println("Price: " + itemPrice);

        }

//        nested for loop
//        declare two arrays
        String[] player = new String[]{"messi", "ronaldo", "bale", "kroos"};
        int[] jerseyNumber = new int[]{10, 7, 11, 8};
        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < jerseyNumber.length; j++) {
                System.out.println("Name: " + player[i] + "," + "jersey number:" + jerseyNumber[j]);
            }
        }
//    exampele -2
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println(i + " " + j);
            }

        }
//        while loops

        int min_limit = 10, max_limit = 20;
        while (min_limit <= max_limit) {
            System.out.println(min_limit);
            min_limit++;
        }

//        do-while loop
        System.out.println("Do While Iteration");
        int start = 10, end = 15;
        do {
            System.out.println("Execute this if condition is true");
            start++;
        }
        while (start <= end);


//       example -2
        int x = 40, y = 46;
        do {
            System.out.println("value: " + x);
            x++;
        }
        while (x < y);
    }

}
