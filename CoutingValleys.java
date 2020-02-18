package HackerRank;
import TrainingModule.Array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.SQLOutput;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CoutingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] ch=s.toCharArray();
        int count=0;
        int valleycount=0;
        for(char value:ch){
            if(value=='D'){
                count--;
            }else{
                count++;
            }
            if(count==-1 && value=='D'){
                valleycount++;
            }

        }
        return (valleycount);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("num of steps taken");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Strings of U and D describing his path");
        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println("num of valleys");
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}