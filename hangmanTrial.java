package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hangmanTrial {
    public void readMovieNames() throws FileNotFoundException {
        File file = new File("C:\\Users\\Sharmila\\Desktop\\Sample.txt");
        Scanner scanner = new Scanner(file);
        int countMovies = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            countMovies++;
        }
        System.out.println("num of movies : " + countMovies);
        String[] film = new String[countMovies];
        scanner.close();
        Scanner scanner1 = new Scanner(file);
        int i = 0;
        while (scanner1.hasNextLine() && i <= countMovies) {
            film[i] = scanner1.nextLine();
            i++;
        }
        scanner1.close();
        int randomNum = (int) (Math.random() * countMovies) + 1;
        for (i = 0; i < countMovies; i++) {
            System.out.println(i + 1 + " . " + film[i]);
        }
        System.out.println("Choosing the movie with randomNum = " + randomNum + " . " + film[randomNum - 1]);

        int countOfLetters = film[randomNum - 1].length();
        System.out.println("Count of letters is = " + countOfLetters);
        String underscore = "";
        for (i = 0; i < countOfLetters; i++) {
            underscore += "_ ";
        }
        System.out.println(underscore);
        int TotalGuessesForYou = 10;
        Scanner scanner2 = new Scanner(System.in);
        String guess;
        underscore = "";
        char[] underscoreArray;
        for (i = 0; i < countOfLetters; i++) {
            underscore += '_';
        }
        underscoreArray = underscore.toCharArray();
        do {
            if (film[randomNum - 1].equals(String.copyValueOf(underscoreArray))) {
                System.out.println("CORRECT ANSWER");
                break;

            } else {
                System.out.println("Guess any letter\n");
                guess = scanner2.nextLine();
                if (String.copyValueOf(underscoreArray).contains(guess)) {
                    TotalGuessesForYou--;
                    System.out.println("that was a repeated guess , number of guesses left for you is " + TotalGuessesForYou);

                } else {
                    char[] rigtAns = new char[countOfLetters];
                    char[] guessAns = new char[countOfLetters];

                    rigtAns = film[randomNum - 1].toCharArray();
                    guessAns = guess.toCharArray();

                    if (!film[randomNum - 1].contains(guess)) {
                        TotalGuessesForYou--;
                        System.out.println("that was wrong guess , number of guesses left for you is " + TotalGuessesForYou);

                    } else {
                        for (i = 0; i < countOfLetters; i++) {
                            if (underscoreArray[i] == '_') {
                                if (rigtAns[i] == guessAns[0]) {
                                    underscoreArray[i] = guessAns[0];
                                }
                            }
                        }
                        System.out.println(underscoreArray);
                    }
                }
            }
        } while (TotalGuessesForYou > 0);
        if (TotalGuessesForYou == 0 && !film[randomNum - 1].equals(String.copyValueOf(underscoreArray))) {
            System.out.println("BETTER LUCK NEXT TIME");
        }
    }
}

class game {
    public static void main(String[] args) throws FileNotFoundException {
        hangmanTrial trial = new hangmanTrial();
        trial.readMovieNames();
    }
}