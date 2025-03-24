package types_operators_flowcontrol;



public class SwitchTest_New {

	enum Number {
	    ONE, TWO, THREE, FOUR;
	}
	
	public static void main(String[] args) {

		Number number = Number.ONE;
		
		String message =
				
		switch (number) {
		    case ONE -> "Got a 1";
		        //break;
		    case TWO -> "Got a 2";
		        //break;
		        
		    case THREE, FOUR -> "got a 3 or 4"; 
		    
//		    default ->	"Other than 1,2,3,4"; // this can be removed because all cases are covered
  
		   
		};
		
		System.out.println(message);
	}

}
