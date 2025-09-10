package com.practice.app;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args){

        int[][] twoDimensionalArrays = new int[2][3];
        twoDimensionalArrays[0][1] = 1; // [[0, 1, 0], [0, 0, 0]]
        char[][] twoDimeansionalArrayWithNewMethdo = {{'a', 'b'}, {'1', '2', '3'}};
        System.out.println(Arrays.deepToString(twoDimeansionalArrayWithNewMethdo));


        int[][][] threeDimensionalArrays = new int[2][3][3];
        threeDimensionalArrays[0][0][2] = 1; // [[[0, 0, 1], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]]]

        System.out.println(Arrays.deepToString(twoDimensionalArrays));
        System.out.println(Arrays.deepToString(threeDimensionalArrays));


        int[][] mulArray = new int[10][20];
        mulArray[0][2] = 129;
        System.out.println(Arrays.deepToString(mulArray));
        System.out.println(mulArray[0][2]);

        for(int i=0; i < mulArray.length; i++){
            for(int j=0; j<mulArray[i].length; j++){
                System.out.println("i :" +i + " " + "j :" + j);
            }
        }

        int[] testArray = new int[20];
        int insertIndext = 10;
        int newValue = 123;
        for(int i=testArray.length -1; i > insertIndext; i--){
            testArray[i] = i-1;
        }
        testArray[insertIndext] = newValue;
        System.out.println(Arrays.toString(testArray));

        int[] intTestArray = new int[30];

        intTestArray[10] = 223;
        int removeIndex = 10;

        for(int i=removeIndex; i< intTestArray.length; i++){
            intTestArray[i] = i+1;
        }
        System.out.println(Arrays.toString(intTestArray));


        int[] ints = {-4,2,4,6,8,10};
        int minVal = Integer.MAX_VALUE;

        for(int i=0; i<ints.length-1; i++){
            if(ints[i] < minVal){
                minVal = ints[i];
            }
        }
        System.out.println(minVal);

    }
}
