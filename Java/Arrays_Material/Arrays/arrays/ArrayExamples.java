package arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		
		String[] arr2[] = new String[3][3];
		
		arr2[0][2] = "string";
		System.out.println(arr2[0][1]);
		
		
//		arr[0] = "Zero";
//		arr[1] = "One";
//		arr[2] = "Two";
	
		String arr[] = {"Zero","One","Two"};

		for (String s : arr)
			System.out.println(s.toUpperCase());
	}

}
