package com.Bridgelabz_Day1;
import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String str1 = sc.nextLine();

        System.out.println("Enter the second word");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both words are same");
        } else {
            System.out.println("Both words are not same");
        }

    }
}