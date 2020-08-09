//package JavaTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SubString {

	
	public static int subString(String str, int length) {
		TreeSet<String> set = new TreeSet<String>();
		for(int i =0;i<length;i++) {
			for(int j=i+1;j<=length;j++) {
				set.add(str.substring(i, j));
			}
		}
		System.out.println("set of all substrings "+set);
		
		return new ArrayList<>(set).indexOf(str)+1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the num of entries : ");
		int num=scn.nextInt();
		scn.nextLine();
		for(int i =0;i<num;i++) {
			System.out.println("enter the string "+(i+1));
			String str=scn.nextLine();
			System.out.println("occurrence of the original string in the set is in the position number: "+subString(str,str.length()));
		}
		scn.close();
	}

}
