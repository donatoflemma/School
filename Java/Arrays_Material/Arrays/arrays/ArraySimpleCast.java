package arrays;

public class ArraySimpleCast {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		byte[] byteArray = new byte[5];
//		intArray = byteArray; 
		
		Object[] objArray = new Object[3];
		Integer[] integerArray = new Integer[5];
		objArray = integerArray;
	}

}
