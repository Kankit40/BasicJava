
package com.bridgelabz_day5;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the final harmonic position");
        double n = sc.nextInt();
        int i = 0;
        double result = 0;
        
        for (i=1; i <= n; i++){
            result += (double)1/i;
            System.out.println(result);
        }
     sc.close();   
	}

}
