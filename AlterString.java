package com.company;

import java.util.Scanner;

public class AlterString {
    public static void main(String[] args) {
        System.out.println("Number of Test cases : ");
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        if (T >= 1 && T <= 10) {
            for (int t = 1; t <= T; t++) {
                System.out.println("Enter the word "+t);
                char[] S = scanner.nextLine().toCharArray();

                String line = "";
                int len = S.length;
                if (len >= 2 && len <= 10000) {
                    for (int even = 0; even <= len - 1; even += 2) {
                        line += S[even];
                    }
                    line += " ";
                    for (int odd = 1; odd <= len - 1; odd += 2) {
                        line += S[odd];
                    }
                    System.out.println(line);
                }
            }

        }
    }
}
