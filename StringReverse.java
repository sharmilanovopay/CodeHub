package TrainingModule;

public class StringReverse {

    public static void main(String[] args) {
        StringReverse rev = new StringReverse();
        System.out.println(rev.getString("sham"));
    }
    public String getString(String s1){
        char[] c1= s1.toCharArray();
        for (int i =0,j=c1.length-1;i<(c1.length/2);i++,j--){
            c1[i]= (char)(c1[i]+c1[j]);
            c1[j]= (char)(c1[i]-c1[j]);
            c1[i]= (char)(c1[i]-c1[j]);
        }
        return String.valueOf(c1);
    }
}
