package com.Bridgelabz_Day2;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        int x2 = Sc.nextInt();
        System.out.println("Enter the value of Y");
        int y2 = Sc.nextInt();

        int x1 = 0;
        int y1 = 0;

        double Distance = Math.sqrt(((x2 - x1)*(x2 - x1) +(y2 - y1) * (y2 - y1)));
        System.out.println("The line length is :" + Distance);
    }
}
