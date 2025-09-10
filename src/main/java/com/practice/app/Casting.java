package com.practice.app;

public class Casting {

    public static void main(String[] args) {

    String x = "5";
    int y = Integer.parseInt(x) + 9;
    System.out.println(y);


    char ch = '6';
    int num = Integer.parseInt(String.valueOf(ch)) + 3;
    System.out.println(num);

    String str = "4.58";
    float num2 = Float.parseFloat(str) + 3.14F;
    System.out.println(num2);

    String a = "2.33";
    double b = Double.parseDouble(a) + 3;
    System.out.println(b);

    int num3 = 34;
    String str2 = String.valueOf(num3);
    System.out.println(str2 + str2);

    char ch1 = '4';
    String ch2 = String.valueOf(ch1) + '4';
    System.out.println(ch2 + "size");


    double z = 2.5; // 2 ceiling
    int t = (int) z + (int)5.5; // 5 ceiling
        System.out.println(t);
    }
}
