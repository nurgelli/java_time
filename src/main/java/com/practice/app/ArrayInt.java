package com.practice.app;

import java.util.Arrays;

public class ArrayInt {
    public static void main(String[] args){

        char[] chars = new char[5];
        String[] stringArrays = new String[5];
        int[] numArrays = new int[5];
        boolean[] booleanArrays = new boolean[5];

        chars[0] = 'a';
        stringArrays[1] = "Hello";
        numArrays[2] = 1;
        booleanArrays[0] = true;


        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(stringArrays));
        System.out.println(Arrays.toString(numArrays));
        System.out.println(Arrays.toString(booleanArrays));



        // new way to initilizing Array. Arrays in java are fixed size. you can't add or remove

        int[] newMethodArray = {7,2,3,4,5};
        Arrays.sort(newMethodArray);
        String[] newMethodArrayString = {"Hello", "How", "Are", "You"};
        char[] newChar = {'a', 'b'};
        boolean[] newBool = {true, false, true};

        System.out.println(Arrays.toString(newMethodArray));
        System.out.println(newMethodArray.length);
        System.out.println(Arrays.toString(newMethodArrayString));
        System.out.println(Arrays.toString(newChar));
        System.out.println(Arrays.toString(newBool));



        String[] newArrayCreated = new String[10];

        for(int i=0; i < newArrayCreated.length; i++){
            newArrayCreated[i] = "String no" + i;
        }
//        for(int i=0; i < newArrayCreated.length; i++){
//            System.out.println(newArrayCreated[i]);
//        }
        for(String theString : newArrayCreated){
            System.out.println(theString);
        }


        int[] intForLoop = new int[5];

        for(int i=0; i < intForLoop.length; i++){
            intForLoop[i] = i;
            System.out.println(i);
        }
        for(int theInt:intForLoop){
            System.out.println(theInt);
        }

    }
}
