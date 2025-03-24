package types_operators_flowcontrol;



public class Conditions_1 {

	public static void main(String[] args) {

		int test = 5;
		
		if (++test == 5) { 
			System.out.println("Test is " + test++);
			System.out.println("Now it's " + test);
		} else if (test == 6)
			System.out.println("six");
		else
			System.out.println("another numner");
	}

}
