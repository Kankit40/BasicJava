package com.Bridgelabz_Day2;
import java.util.Scanner;

public class SumOfNaturalNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int a = sc.nextInt();
        int sum = 0;
        int i = 0;

        while(i<a) {
            i++;
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
