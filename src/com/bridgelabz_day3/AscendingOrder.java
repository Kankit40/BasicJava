package com.bridgelabz_day3;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] a = {34, 66, 85, 27, 43, 57, 79, 12};

        Arrays.sort(a);

        System.out.println("The element of array in acending order are is ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}