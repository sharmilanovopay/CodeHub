package com.company;
class Pattern1{
    private int i;
    private int j;
    public Pattern1(int n){
        for (i=0;i<=n;i++){
            String line="";
            for (j=0;j<=i;j++){
                if(j==0 || j==i){
                    line+="1";
                }else{
                    line+="0";
                }
            }
            System.out.println(line);
        }
    }
}

class Pattern2{
    private int i;
    private int j;
    private int seq;
    public Pattern2(int n){
        for (i=0;i<n;i++){
            String line="";
            for (j=0;j<n+2;j++){
                if (i%2==0){
                    seq = i*(n+2) + j ;
                    seq++;
                    line+= " "+seq;
                }else{
                    seq = i*(n+2)+(n+2) -j;
                    line+= " "+seq;
                    seq--;
                }
            }
            System.out.println(line);
        }
    }
}

class Pattern3{
    private int i;
    private int j;
    private int seq = 0;
    private int counter=1;
    public Pattern3(int n){
        for (i=1;i<=n;i++){
            String line="";
            for (j=1;j<=i;j++){
                if (i%2!=0) {
                    line += counter + " ";
                }
                else {
                    seq = counter+i-2*j+1;
                    line += seq + " ";
                    seq--;
                }
                counter++;
            }System.out.println(line);
        }

    }
}

public class PatternMain {

    public static void main(String[] args) {
        Pattern1 pattern1=new Pattern1(5);
        Pattern2 pattern2=new Pattern2(4);
        Pattern3 pattern3=new Pattern3(5);
    }
}
