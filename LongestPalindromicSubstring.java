package DQ;

public class LongestPalindromicSubstring {

    int lpsLength(String st){
        return lps_aux(st,0,st.length()-1);
    }

    private int lps_aux(String st, int startIndex, int endIndex){
        if(startIndex>endIndex){
            return 0;
        }
        if(startIndex==endIndex){
            return 1;
        }
        int c1=0;
        if(st.charAt(startIndex)==st.charAt(endIndex)){
            int remainingLength=(endIndex-1)-startIndex;
            if(remainingLength == lps_aux(st,startIndex+1,endIndex-1)){
                c1=2+remainingLength;
            }
        }
        int c2=lps_aux(st,startIndex,endIndex-1);
        int c3=lps_aux(st,startIndex+1,endIndex);
        return Math.max(c1,Math.max(c2,c3));
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps=new LongestPalindromicSubstring();
        System.out.println("The longest palindromic substring's length = "+lps.lpsLength("AfterNOON"));
    }
}
