package com.company;

public class PrimeNum {
    public static void main(String[] args) {
        int num;

        for (num = 30; num >= 1; num--) {
            PrimeNumMethod(num);
        }
    }
    private static void PrimeNumMethod(int num) {
        int range;
        int count = 0;

        // we know that the Sqrt can not be an int, it will be double,
        // but its enough for the program to test the integer part of the num,
        // so we are maintaining int for 'num'

        for (range = 2; range <= Math.sqrt(num); range++) {
            if (num % range == 0) {
                count++;
            }
            if (count>1) break;
        }
        if (count == 0) {
            System.out.println(num);
        }
    }
}