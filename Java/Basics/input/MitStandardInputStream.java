package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MitStandardInputStream {

	public static void main(String[] args) throws IOException {
	
		System.out.println("bitte ein Integer eingeben:  ");
		 
		while(true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));        
        	String eingabe = input.readLine();
        	
        	// prüfen ob integer
        	try {
        		Integer.parseInt(eingabe);
        		System.out.println(eingabe + " Danke");
        		break;        		
        	}
        	catch(NumberFormatException nfe) {
        		System.out.println("das war kein Integer - versuch es noch einmal");
        	}
		}
		System.out.println("und tschüss");
	}

}
