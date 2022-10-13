package com.Bridgelabz_Day2;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day in dd format");
        int a = sc.nextInt();

        System.out.println("Enter Month in mm format");
        int b = sc.nextInt();

        switch(b){
            case 03:
                if(a>=20 && a<=31) {
                    System.out.println(a + " of March is velid");
                }else
                    System.out.println("Date is invalid");
                break;

            case 04:
                if(a>=01 && a<=30) {
                    System.out.println(a + " of April is velid");
                }else
                    System.out.println("Date is invalid");
                break;

            case 05:
                if(a>=01 && a<=31) {
                    System.out.println(a + " of May is velid");
                }else
                    System.out.println("Date is invalid");
                break;

            case 06:
                if(a>=01 && a<=20) {
                    System.out.println(a + " of June is velid");
                }else
                    System.out.println("Date is invalid");
                break;

            default:
                System.out.println("Date is invalild");

        }
    }
}
