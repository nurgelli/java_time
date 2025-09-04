package com.practice.app;

import com.practice.model.Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean continueOperation = true;

        while (continueOperation){
            try {
            System.out.println("Enter number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter number: ");
            double num2 = input.nextDouble();
            System.out.println("Enter operand: ");
            char operand = input.next().charAt(0);
        double result = 0;
        if (operand == '+'){
            result = calc.add(num1, num2);
        } else if (operand == '-') {
            result = calc.sub(num1, num2);
        } else if (operand == '/'){
            result = calc.div(num1, num2);
        } else if (operand == '*'){
            result = calc.mul(num1, num2);
        } else if (operand == '%'){
            result = calc.mod(num1, num2);
        } else {
            System.out.println("Invalid operation!");
            continue;
        }
        System.out.println("Result: " + result);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                input.nextLine();
            } finally {
        System.out.println("Do you want to continue? yes or no");
        String choice = input.next();
        if (choice.equals("no")){
            continueOperation = false;
        System.out.println("Thank you for using calculator!");
        }
        System.out.println("LastResult: " + calc.getlastResult());
            }
    }
        input.close();
    }
}