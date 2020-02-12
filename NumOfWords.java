package TrainingModule;

import java.util.HashMap;

public class NumOfWords {
    public static void main(String[] args) {
        String str= "This this is is Sharmila Sharmila and I I";
        String[] words = str.split(" ");
        System.out.println("num of words = "+ words.length);
        String[] letters = str.split("");
        System.out.println("num of letters = "+ letters.length);
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<words.length;i++){
            if(map.containsKey(words[i])){
                int count=map.get(words[i]);
                map.put(words[i],count+1);
            }else {
                map.put(words[i], 1);
            }
        }
        System.out.println(map);
    }
}
