package com.practice.app;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args){

    int temprature = 22;
    boolean isWarm = temprature > 20 && temprature < 25; // && == and
        System.out.println("isWarm is " + isWarm);

        boolean goodIncome = true;
        boolean goodCredential = true;
        boolean foreigner = false;
        boolean isEligible = (goodIncome || goodCredential) && !foreigner; // || == or
        System.out.println("Eligible "+isEligible);


        byte temp = 25;
        if (temp > 30) {
            System.out.println("It's a hot day. drink plenty of water");
        }
        else if (temp > 20){
            System.out.println("It's a nice day");
        }
        else
            System.out.println("It's cold");


        int income = 499;
        boolean hasGoodIncome = false;
        if (income > 1000)
            hasGoodIncome = true;
        else if (income > 500)
            hasGoodIncome = true;
        else
            hasGoodIncome = false;

        System.out.println("hasGoodIncome is " + hasGoodIncome);

        int benefit = 4_000;
        String className = benefit > 5_000 ? "First" : "Economy";
        System.out.println("class name is " + className);


        Scanner scan = new Scanner(System.in);

        System.out.println("Provide number: ");
        int number = scan.nextInt();

        int n = 15 / 3;
        System.out.println(n);


        else if (number % 3 == 0 && number % 5 == 0)
            System.out.println("fizzbuz");
        if (number % 3 == 0)
            System.out.println("fiz");
        else if (number % 5 == 0)
            System.out.println("buzz");

        else
            System.out.println(number);



    }



}
