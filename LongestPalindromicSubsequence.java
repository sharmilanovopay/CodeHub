package DQ;

public class LongestPalindromicSubsequence {

    public int LPSlength(String st){
        return LPSAux(st,0,st.length()-1);
    }

    private int LPSAux(String st,int startIndex, int endIndex){
        if(startIndex>endIndex){
            return 0;
        }
        if(startIndex==endIndex){
            return 1;
        }
        int count1=0;
        if(st.charAt(startIndex)==st.charAt(endIndex)){//if matched add 2
            count1=2+LPSAux(st,startIndex+1,endIndex-1);
        }
        int count2=LPSAux(st,startIndex+1,endIndex);
        int count3=LPSAux(st,startIndex,endIndex-1);
        return Math.max(count1,Math.max(count2,count3));
    }

    public static void main(String[] args) {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        System.out.println(lps.LPSlength("sharmilma"));
    }
}
