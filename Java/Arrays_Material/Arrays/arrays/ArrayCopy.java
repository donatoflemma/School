package arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','e'};
		char[] arr2 = new char[7];
		
		Arrays.fill(arr2, '.'); // init elements by '.'
		
		System.out.println(arr2);
		
		for (char c : arr2)
			System.out.print(c);
		
		
		System.out.println("\n-----------------");
		
		System.arraycopy(arr, 1, arr2, 3, 2);
		for (char c : arr2)
			System.out.print(c);
		
		
				
	}

}
