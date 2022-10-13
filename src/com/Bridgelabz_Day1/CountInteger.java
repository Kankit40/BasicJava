package com.Bridgelabz_Day1;

public class CountInteger {
    public static void main(String[] args) {

       int sum = 0;
       for (int i = 0; i < args.length; i++){
               sum = sum + Integer.parseInt(args[i]);

       }
        System.out.println("the sum is : "+sum);
        System.out.println("Number of inputs are " + args.length);
    }
}
