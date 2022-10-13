package com.Bridgelabz_Day2;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = Sc.nextInt();
        System.out.println("Enter the value of b");
        int b = Sc.nextInt();
        System.out.println("Enter the value of c");
        int c = Sc.nextInt();

        double delta = (b*b) - (4*a*c);

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        double value1 = (a * root1 * root1) + (b * root1) + c;
        double value2 = (a * root2 * root2) + (b * root2) + c;

        System.out.println("First root is " + value1);
        System.out.println("Second root is " + value2);
    }
}
