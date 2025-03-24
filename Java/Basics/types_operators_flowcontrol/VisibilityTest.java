package types_operators_flowcontrol;

public class VisibilityTest {

	public static void main(String[] args) {
		
		int index = 0;	// index is visible from outside and inside of for loop
		for(; index < 10 ;index++) {			
		}	
		
		for(int i = 0; index < 10 ;index++) {	// i and b are not visible from outside
			int b = 22;
			i++;
		}
		
		int i = 0;
		int x = i; 	// error
		int a = index;
		i++;
//		a = b; 		// error
		a = x;

	}

}
