package com.Bridgelabz_Day2;
import java.util.Scanner;

public class ReverseIntegerWhile {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Sc.nextInt();
        int reminder = 0;
        int reverse = 0;

        while (n > 0){

            reminder = n % 10;
            reverse =reverse * 10 + reminder;
            n = n / 10;
        }
        System.out.println(reverse);

    }
}
