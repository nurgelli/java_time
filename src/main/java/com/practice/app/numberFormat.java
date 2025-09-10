package com.practice.app;

import java.text.NumberFormat;

public class numberFormat {
    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(23456677.5667);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String res = percentage.format(0.1);
        System.out.println(res);  // Shift + F6


        String resultChain = NumberFormat.getPercentInstance().format(0.2);
        String resultChainCurrency = NumberFormat.getCurrencyInstance().format(300.34);
        System.out.println(resultChainCurrency);
        System.out.println(resultChain);




    }

}
