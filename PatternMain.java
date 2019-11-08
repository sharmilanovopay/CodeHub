package com.company;

class Pattern1 {
    private int i;
    private int j;

    public Pattern1(int n) {
        for (i = 0; i <= n; i++) {
            String line = "";
            for (j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    line += "1";
                } else {
                    line += "0";
                }
            }
            System.out.println(line);
        }
    }
}

class Pattern2 {
    private int i;
    private int j;
    private int seq;

    public Pattern2(int n) {
        for (i = 0; i < n; i++) {
            String line = "";
            for (j = 0; j < n + 2; j++) {
                if (i % 2 == 0) {
                    seq = i * (n + 2) + j;
                    seq++;
                    line += " " + seq;
                } else {
                    seq = i * (n + 2) + (n + 2) - j;
                    line += " " + seq;
                    seq--;
                }
            }
            System.out.println(line);
        }
    }
}

class Pattern3 {
    private int i;
    private int j;
    private int seq = 0;
    private int counter = 1;

    public Pattern3(int n) {
        for (i = 1; i <= n; i++) {
            String line = "";
            for (j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    line += counter + " ";
                } else {
                    seq = counter + i - 2 * j + 1;
                    line += seq + " ";
                    seq--;
                }
                counter++;
            }
            System.out.println(line);
        }
    }
}

class Pattern4 {
    int k;
    int m = 1;
    int l = 4;
    int p;

    public Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            k = i;
            p = i + 1;
            String line = i + " " + (i + 1) + " ";
            for (int j = 1; j <= n; j++) {
                if (j % 2 != 0) {
                    k += m;
                    line = line + k + " ";
                    m++;
                } else {
                    p += l;
                    l++;
                    line = line + p + " ";
                }
            }
            System.out.println(line);
        }
    }
}


class Pattern5 {
    int i;
    int j;

    public Pattern5(int n) {
        int k = -1;
        for (i = 1; i <= n; i++) {
            String line = "";
            if (i <= (Math.abs(n % 2 + n / 2))) {
                k += 2;
                for (j = 1; j < ((Math.abs(n % 2 +1+ n / 2))-i); j++) {
                    line += "  ";
                }
                for (j = 1; j <= k; j++) {
                    line += "* ";
                }
            } else {
                k -= 2;
                for (j = 1; j < (i+1-(Math.abs(n % 2 + n / 2))); j++) {
                    line += "  ";
                }
                for (j = 1; j <= k; j++) {
                    line += "* ";
                }
            }
            System.out.println(line);
        }
    }
}

    class Pattern6 {
        int i;
        int j;

        public Pattern6(int n) {
            for (i = 1; i <= n; i++) {
                String line = "";
                int l = 1;
                int m = 5;
                int k = Math.abs((1 + n / 2) - i);
                for (j = 1; j <= k; j++) {
                    line += " ";
                }
                for (j = l; j <= m; j++) {
                    line += "* ";
                    l += 2;
                }
                System.out.println(line);
            }
        }
    }

    class Pattern7{
    int i;
    int j;
    public Pattern7(int n){
        int m=n+2;
        int l=-1;
        for (i=1;i<=n;i++){
            String line="";
            if (i<=(n/2+n%2)){
                l++;
                for (int space=1;space<=l;space++){
                    line+="  ";
                }
                m-=2;
                for (int star=1;star<=m;star++){
                    line+="* ";
                }
            }
            else{
                l--;
                for (int space=1;space<=l;space++){
                    line+="  ";
                }
                m+=2;
                for (int star=1;star<=m;star++){
                    line+="* ";
                }
            }
            System.out.println(line);
        }
        }
    }

    public class PatternMain {

        public static void main(String[] args) {
        Pattern1 pattern1=new Pattern1(5);
            System.out.println("\n");
        Pattern2 pattern2=new Pattern2(4);
            System.out.println("\n");
        Pattern3 pattern3=new Pattern3(5);
            System.out.println("\n");
        Pattern4 pattern4=new Pattern4(5);
            System.out.println("\n");
        Pattern5 pattern5 = new Pattern5(7);
            System.out.println("\n");
        Pattern6 pattern6 = new Pattern6(7);
            System.out.println("\n");
        Pattern7 pattern7 = new Pattern7(7);
        }
    }

