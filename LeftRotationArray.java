package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotationArray {

    //increased time complexity O(n2)
    static int[] rotLeft(int[] a, int d) {
        int RotatableElement=Integer.MIN_VALUE;
        for(int j=0;j<d;j++) {
            for (int i = 0; i < a.length ; i++) {
                if (i == 0) {
                    RotatableElement = a[0];
                    a[i] = a[i + 1];
                } else if (i == a.length - 1) {
                    a[i] = RotatableElement;
                }else {
                    a[i] = a[i + 1];
                }
            }
            System.out.println("\ncurrent iteration "+(j+1));
            for(int val : a){
                System.out.print(val +" ");
            }
        }
        return a;
    }

    //reduced time complexity O(n)
    static int[] rotLeftTry(int[] a , int d){

        int effectiveD = d%a.length;
        ArrayList<Integer> AL = new ArrayList<>();
        d = effectiveD;
        int[] temp=a.clone();
        int temp_index =0;
        for(int i =d;i<a.length;i++){
            temp[temp_index++]=a[i];
        }
        for(int i =0;i<d;i++){
            temp[temp_index++]=a[i];
        }
        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("num of elements in arr and the num of rotations to be made");
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        System.out.println("array of elements");
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeftTry(a, d);

        System.out.println("\noutput");
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
