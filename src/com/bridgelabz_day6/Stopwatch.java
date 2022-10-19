package com.bridgelabz_day6;
import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press e to start the stopwatch");
		String in = sc.nextLine();
		
		
		long startTime = 0;
		long endTime = 0;
		
				
		if(in.equals("e")) {
			System.out.println("The stopwarch has started");
			
			startTime = System.currentTimeMillis();
			
			in = sc.nextLine();
			System.out.println("Press e to stop the watch");
			
			if(in.equals("e")) {
				
				System.out.println("The stopwatch has stopped");
				
				endTime = System.currentTimeMillis();
				
				long totalTime = endTime - startTime;
				
				int hours = (int)totalTime /(1000*60*60);
				int min = (int)totalTime /(1000*60);
				int sec = (int)totalTime /(1000);
				int mils = (int)totalTime %1000;
				
				System.out.println("The time is " +hours+ " hh " +min+ " mm " +sec+ " ss " + mils+ " ms ");
				
			}else {
				System.out.println("Invalid input");
			}
								
		}else {
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
