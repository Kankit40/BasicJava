package com.Bridgelabz_Day2;
import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int once = 0;
        int ten = 0;
        int hundred = 0;
        int thousand = 0;

        if (num > 0 && num < 10000) {
            thousand = num / 1000;
            System.err.print(thousand + " Thousnad ");

            hundred = (num / 100) % 10;
            System.err.print(hundred + " Hundred ");

            ten = (num / 10) % 10;
            System.err.print(ten + " Tens ");

            once = (num % 10);
            System.err.print(once + " Ones ");
        }
        sc.close();
    }
}