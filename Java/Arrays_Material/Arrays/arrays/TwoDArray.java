package arrays;

public class TwoDArray {

	public static void main(String... args) {
		char[][] arr = {{'a','b'},{'c','d','e'},{'f','g'}};
		
		System.out.println(arr[1][2]);
		
		for (int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		
		char[][] arr2 = new char[2][3];
		arr2[0][0] = 'z';
		arr2[0][1] = 'C';
		arr2[1][0] = 'A';
		arr2[1][1] = 'B';
		arr2[1][2] = 'Z';
		
		System.out.print("\n" + arr2[0][1]);
		System.out.print("\n" + arr2[1][0]);
		System.out.print("\n" + arr2[1][1]);
		System.out.print("\n" + arr2[1][2]);
		
	}

}

