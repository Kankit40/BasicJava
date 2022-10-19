package com.bridgelabz_day5;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter the Number 3");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println( num1 + " is grater than " + num2 +  " and " + num3);
        } else if (num2 > num1 && num2 > num3) {

            System.out.println(num2 + " is grater than " + num1 +  " and " + num3);
        }else
            System.out.println(num3 + " is grater than " + num1 +  " and " + num2);
	
	sc.close();
	}

}