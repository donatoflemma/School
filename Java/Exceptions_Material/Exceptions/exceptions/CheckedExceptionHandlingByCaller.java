package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionHandlingByCaller {

	
	static public void main(String[] arg ) throws Exception { //throws Exception
		
	  try {
	        method_A("src/exceptions/AAxxx.txt"); 	// xxx.txt
	  }
	  catch( IOException ioe ) { 
		   System.out.println("catch-Block aktiv for 'IOException'" );// IOException é una normale classe che é presente in Java per questo tipo di azioni	   
	  }  
	  catch( Exception ioe ) { 
		   System.out.println("catch-Block aktiv for 'IOException'" );	   
	  }  
	  finally {
	       System.out.println("finally-Block aktiv");	       
	  }
  
	  System.out.println("hier geht es weiter nach dem kritischen Code");
}


//---must handle or throw a checked exception-----------------------------------------
static void method_A(String filePath) throws FileNotFoundException {
           
			Scanner scan = new Scanner(new File(filePath));
			System.out.println(scan.next());
}
//--------------------------------------------------------------------------
}
