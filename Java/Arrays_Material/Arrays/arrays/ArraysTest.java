package arrays;
import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		nums[0] = 222; 
		nums[3] = 333;
		
		for(int i = 0; i < nums.length; i++ ) {
			System.out.println(nums[i]);
			nums[i] = 888;
		}
		
		System.out.println("-".repeat(10));
		
		for(int element : nums) {
			element = 777; // No!!!
		}
		for(int element : nums) {
			System.out.println(element);
		}
		
		System.out.println("-".repeat(10));
		
		int[][] numbers = {{33,55}, {77,89,12}, {4,5,6,7}};
		listUp(numbers);
		
	}
	
	static void listUp(int[][] nums) {
		for(int[] element : nums) {
			for(int i : element) {
				System.out.println(i);
			}
		}
	}	
}

