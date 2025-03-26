package arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String... args) {
		String[] arr = {"Zero","One","Two"};
		Arrays.sort(arr);
		for (String s : arr) {
			System.out.println(s);
		}
		
		int[] intArr = {1,5,2,4,3};
		Arrays.sort(intArr);
		for (int s : intArr) {
			System.out.println(s);
		}
		

	}

}
