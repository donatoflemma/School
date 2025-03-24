package types_operators_flowcontrol;

public class SwitchTest {

	
	
	public static void main(String[] args) {
		Integer num = 0;
		
		final int x = 5;

		
	    switch (num) {
	    default:
	      System.out.println("default");
	    case 4:
	      System.out.println("case1");
	    case x + 10 * 2 - 20:
	      System.out.println("case2");
	      break;
	    }


	}

}
