package com.Bridgelabz_Day1;

public class DefaultValue {

    static boolean s1;
    static double s2;
    static float s3;
    static int s4;
    static long s5;
    static short s6;
    static char s7;
    static byte s8;
    public void adition(){

        System.out.println("Default values.....");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

    }

    public static void main(String[] args) {
        System.out.println("Default values.....");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

        DefaultValue obj = new DefaultValue();
        obj.adition();


    }
}
