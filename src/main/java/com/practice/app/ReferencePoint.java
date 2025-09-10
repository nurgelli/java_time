package com.practice.app;

import java.awt.*;

public class ReferencePoint {

    public static void main(String[] args){

        Point point1 = new Point(1,1);
        System.out.println(point1);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 15;
        point2.y = 56;
        System.out.println("This is point1: " + point1);
        System.out.println("This is point2: " + point2);

    }
}
