package HackerEarth;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegEx {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] firstNameArr = new String[N];
        int count=0;
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            if(!firstNameEmailID[1].contains("@gmail.com")){
                firstNameArr[NItr]="";
                count++;
            }
            if(firstNameEmailID[1].contains("@gmail.com")){
                firstNameArr[NItr]=firstNameEmailID[0];
            }
        }
        Arrays.sort(firstNameArr);
        for(int i=count;i<N;i++){
            System.out.println(firstNameArr[i]);
        }
        scanner.close();
    }
}
