package HackerEarth;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DupEmailName {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] firstNameArr = new String[N];
        String[] emailIDArr = new String[N];
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            firstNameArr[NItr]=firstName;
            String emailID = firstNameEmailID[1];
            emailIDArr[NItr]=emailID;

        }
        String[] emailIDArrTemp=emailIDArr.clone();
        int removeIndex=-1;
        Arrays.sort(emailIDArr);
        for(int i=1;i<emailIDArr.length;i++){
            if(emailIDArr[i-1].equals(emailIDArr[i])){
                removeIndex=i;
            }
        }
        int removeFromName=-1;
        if(removeIndex>=0) {
            for (int i = 0; i < emailIDArrTemp.length; i++) {
                if (emailIDArrTemp[i].equals(emailIDArr[removeIndex])) {
                    removeFromName = i;
                }
            }

            String removeName = firstNameArr[removeFromName];
            Arrays.sort(firstNameArr);

            for (int i = 0; i < firstNameArr.length; i++) {
                if (firstNameArr[i].equals(removeName)) {
                    removeName = "0";
                } else {
                    System.out.println(firstNameArr[i]);
                }
            }

        }
        scanner.close();
    }
}
