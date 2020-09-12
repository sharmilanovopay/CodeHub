import java.util.ArrayList;
import java.util.List;

public class ShiftZerosToRight {

	public static List<Integer> arrange(int[] arr) { // O(n) + O(n) = O(n)
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			} else {
				count++;
			}

		}
		for (int i = 0; i < count; i++) {
			list.add(0);
		}

		return list;
	}

	public static void main(String[] args) {

		int[] input = new int[] { 0, 8, 1, 0, 5, 7, 1, 0, 0, 0, 0, 6, 3, 2 };
		List<Integer> output = arrange(input);
		for (int i : output) {
			System.out.print(i + " ");
		}

	}

}
