package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //System.out.println("Size of the Char array ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N>=1 && N<=1000){
            String[] array=new String[N];
            Integer addnum = 0;
            for (int i=N-1;i>=0;i--){
                //System.out.println("Enter the character "+i);
                addnum =  scanner.nextInt();
                array[i] = addnum.toString();
            }
            for(String ch : array){
                System.out.print(ch+" ");
            }
        }
    }
}
