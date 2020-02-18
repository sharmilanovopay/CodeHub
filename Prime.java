package HackerEarth;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            Boolean isPrime=true;
            int num = sc.nextInt();
            if(num==1){
                isPrime=false;
            }
            for(int i=2;i<=Math.pow(num,0.5);i++){
                if( num%i==0){
                    isPrime=false;
                }
            }
            System.out.println(isPrime?"Prime":"Not prime");
        }

    }
}
