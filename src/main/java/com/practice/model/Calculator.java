package com.practice.model;


public class Calculator {
    private double lastResult;


    public Calculator() {
        this.lastResult = 0.0;
    }

    public double getlastResult() {
        return this.lastResult;
    }

    public double add(double a, double b){
        lastResult = a+b;
        return lastResult;
    }
    public double sub(double a, double b){
        lastResult = a-b;
        return lastResult;
    }
    public double mul(double a, double b){
        lastResult = a * b;
        return lastResult;
    }
    public double div(double a, double b){

        if (b == 0){
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
    public double mod(double a, double b){
        lastResult = a % b;
        return lastResult;
    }


}
