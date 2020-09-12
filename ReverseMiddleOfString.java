public class ReverseMiddleOfString {
	/*
	 * Reverse middle words and the characters in them
   * Input : I am from Blr 
   * Ouput : I morf ma Blr
	 */
	
	public static void main(String[] args) { //O(n2)
		String str = "I am from bangalore";
		String[] str_Arr = str.split(" ");
		for(int i = 1;i<=(str_Arr.length-1)/2;i++) {
			String temp = new StringBuilder(str_Arr[i]).reverse().toString();
			str_Arr[i]=new StringBuilder(str_Arr[str_Arr.length-1-i]).reverse().toString();
			str_Arr[str_Arr.length-1-i]=temp;
		}
		for(String value :str_Arr) {
			System.out.print(value+" ");
		}
	}
	
}
