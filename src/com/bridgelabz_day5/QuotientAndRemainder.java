package com.bridgelabz_day5;
import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Divident");
	        int divident = sc.nextInt();

	        System.out.println("Enter Divisor");
	        int divisor = sc.nextInt();

	        int quotient = (divident/divisor);
	        int reminder = divident%divisor;

	        System.out.println("Quitient is :" + quotient);
	        System.out.println("Reminder is " + reminder);

	}

}
