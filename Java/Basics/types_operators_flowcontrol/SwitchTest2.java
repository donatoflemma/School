package types_operators_flowcontrol;



public class SwitchTest2 {

	public static void main(String[] args) {

		int day = 2;
		final int test = 1;		
		
		switch (day) {
		case test: System.out.println("Mon"); break;
		case test+1: System.out.println("Tue"); //break;
		case 3: 
			//System.out.println("Wed"); break;
		case 4: System.out.println("Thu"); 
		case 5: System.out.println("Fri"); break;
		case 6: System.out.println("Sat"); break;
		case 7: System.out.println("Sat"); break;
		default: System.out.println("No such day"); break;
		
		}

	}

}
