package com.Bridgelabz_Day2;
import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int a = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<=a; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
