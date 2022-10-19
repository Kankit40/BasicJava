package com.bridgelabz_day3;

public class EvenArray {
    public static void main(String[] args) {

        int [] a = {4,6,8,3,5,7,3,6,8};

        for(int i = 0; i<a.length; i++){
            if(i%2 == 0){

            }else {
                System.out.println("The element on the even position is " + a[i]);
            }
        }
    }
}
