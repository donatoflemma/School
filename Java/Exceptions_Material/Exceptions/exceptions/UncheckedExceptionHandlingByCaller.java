package exceptions;

public class UncheckedExceptionHandlingByCaller {

	static public void main   (String[] arg )  { 
		
		   try {			     		        
		         method_B("a123");		        
		   }
		   catch(NumberFormatException nfe ) { 	
				 System.out.println("catch-Block aktiv for 'NumberFormatException'"); 
		   }		   
		   finally {
		        System.out.println("finally-Block aktiv");		        
		   }
		   
		   System.out.println("hier geht es weiter nach dem kritischen Code");
	}

	// 'throws NumberFormatException' ist nicht nötig bei Unchecked Exceptions
	static void method_B(String x) { 		
		System.out.println(Integer.parseInt(x));    		   
}	 
		
		//------------------------------------------------------------------------
}