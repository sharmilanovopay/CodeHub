package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    static long repeatedString(String s, long n){
        long quotient = n/(s.length());
        long remainder = n %(s.length());
        long count=0;
        char[] c = s.toCharArray();
        for(int i =0;i<c.length;i++){
            if(c[i]=='a'){
                count++;
            }
        }
        count*=quotient;
        for(int i =0;i<remainder;i++){
            if(c[i]=='a'){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s,n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

