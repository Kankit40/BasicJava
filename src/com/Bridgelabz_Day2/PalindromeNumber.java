package com.Bridgelabz_Day2;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int Reminder = 0;
        int Reverse = 0;
        int temp = n;

        System.out.println("Input number is " + n);

        for(;n != 0;){
            Reminder = n % 10;
            Reverse =Reverse * 10 + Reminder;
            n = n / 10;

        }
        System.err.println(Reverse);
        if(temp==Reverse) {
            System.out.println("The number is Palindrome");
        }else
            System.out.println("The number is not Palindrome");
    }
}
