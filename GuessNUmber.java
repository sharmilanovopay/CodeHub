package com.company;

import java.util.Scanner;

public class GuessNUmber {
    public static void main(String[] args) {
        System.out.println("The computer has thought of a num, guess it");
        int randomNumber= (int)(Math.random()*100)+1;
        int userinput;
        int guess = 10;
        do {
            System.out.println(guess + " guesses left");
            Scanner scanner = new Scanner(System.in);
            userinput=scanner.nextInt();
            scanner.nextLine();
            if (userinput == randomNumber) {
                System.out.println("Your guess is right, the num is " + randomNumber + " congrats on finding it with " + guess + " guesses left");
            }else if (userinput > randomNumber){
                System.out.println("computer guessed a number less than your guess "+ userinput);
            }else{
                System.out.println("Computer guessed a number  greater than your guess "+ userinput);
            }
            guess--;
        }while (userinput != randomNumber && guess !=0);
        if (guess==0){
            System.out.println("use binary search algorithm bro");
        }

    }
}
