package com.bridgelabz_day3;

import java.util.Arrays;

public class SmallestArray {
    public static void main(String[] args) {
        int [] a = {3,6,8,2,4,5,7,1};

        Arrays.sort(a);

        System.out.println("The smallest element is "+ a[0]);
    }
}
