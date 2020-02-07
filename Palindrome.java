package TrainingModule;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.StringCompare("palindrome");
        p.StringCompare("saippuakivikauppias");
    }

    public void StringCompare(String s1){
        char[] ch1=s1.toLowerCase().toCharArray();
        for(int j=s1.length()-1, i=0;i<1+s1.length()/2;i++,j--){
            char temp=ch1[i];
            ch1[i]=ch1[j];
            ch1[j]=temp;
        }
        String rev=String.valueOf(ch1);
        System.out.println("Reverse of s1 = "+rev);
        if(rev.equals(s1.toLowerCase())){
            System.out.println("Palindrome");
        }
    }
}
