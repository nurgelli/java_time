package com.practice.app;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String username = input.next();
//        System.out.println(username);  // if nurgelli tuwakov -> will give just nurgelli token not tuvakov
        String lastName = input.nextLine();
        System.out.println("your lastname: " + lastName);

        int mathInput = input.nextInt();
        System.out.println("your math input: " + mathInput);


    }
}
