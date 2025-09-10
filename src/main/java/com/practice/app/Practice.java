package com.practice.app;


public class Practice {

// data taypes in java
    public static void main(String[] args){
        byte byteNumber = 127; // primitive
        short shortNumber = 3434;
        int intNumber = 234234;
        long longNumber = 234234234;
        float floatNumber = 3;
        double doubleNumber = 3.123456789901234;
        char charChar = '2'; // only one char
        boolean iscorrect = true; // primitive
        String name = "Hello Mr."; // Reference
        System.out.println(charChar);


        // changing values with temp variables
        String x = "water";
        String y = "butter";
        String temp;

        temp = x;
        x = y;
        y = x;

        System.out.println("Temporary:" + temp);
        System.out.println("Water x: " + x);
        System.out.println("Butter y: " + y);

    }
}
