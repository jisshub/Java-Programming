package com.company;

public class StringProgram3 {
    public static void main(String[] args) {
        CountMe.countWords("hello man 332 how are you 24 y");
    }
}

class CountMe{
    public static void countWords(String s){
        int wordCount = 0;
        boolean word = false;
        int lineEnd = s.length() - 1;

        for (int i = 0; i < s.length() ; i++) {
            // if the char is a letter, word = true.
            if(Character.isLetter(s.charAt(i)) && i!=lineEnd){
                word = true;
            }
            // if char isn't a letter and there have been letters before,
            // counter goes up.
            else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
            }
            // last word of String; if it doesn't end with a non letter, it
            // wouldn't count without this.
            else if (Character.isLetter(s.charAt(i)) && i == lineEnd) {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
