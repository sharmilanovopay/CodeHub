
import java.util.Scanner;

public class MinNumOfFlipsRequired {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the expected string");
		String expected = scn.nextLine();
		String original = "00000";
		char[] original_Array = original.toCharArray();
		char[] expected_Array = new char[5];

		int exp_index=4;
		int exp_length=expected.length()-1;
		for(int k=4;k>=0;k--) {
			if(exp_length>=0)
				expected_Array[exp_index--]=expected.charAt(exp_length--);
			else
				expected_Array[exp_index--]='0';
			
		}
		int count = 0 ;
		for (int i = 0; i < original_Array.length; i++) {
			if (original_Array[i] != expected_Array[i]) {
				if (original_Array[i] == '0') {
					for(int j=i;j<original_Array.length;j++) {
						original_Array[j] = '1';
						
					}
				} else {
					for(int j=i;j<original_Array.length;j++) {
						original_Array[j] = '0';
				}
			}
				count++;
		}
	}
		System.out.println("num of flips "+count);
		scn.close();
}
}
