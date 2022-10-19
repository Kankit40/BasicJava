package com.bridgelabz_day5;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number 1 is :" + num1);
        System.out.println("Number 2 is :" + num2);
        
        sc.close();
	}

}
