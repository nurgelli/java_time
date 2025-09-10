package com.practice.app;
import java.lang.Math;

public class MathClass {

    public static void main(String[] args) {
        int result = (int)Math.floor(1.1f); // return (int)
        System.out.println(result);

        String a = "2.33";
        int b = (int)Math.ceil(Double.parseDouble(a)); // 3
        System.out.println(b);

        double c = Math.random();
        System.out.println(c);

        double e = (int)Math.round(Math.random() * 100);
        System.out.println(e);

        int s = (int) (Math.random() * 100);
        System.out.println(s);

        int res = Math.min(-1,87);
        System.out.println(res);


    }
}
