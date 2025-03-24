package input_output;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MitFormattedScanner {

	public static void main(String[] args) {
		System.out.println("bitte ein Integer eingeben:  ");
		 
		while(true) {
			Scanner s = new Scanner(System.in);		
        	
			// Eingabe abholen als integer, sonst wiederholen
        	try {
        		int eingabe = s.nextInt();
        		System.out.println(eingabe + " Danke");
        		break;       		
        	}
        	catch(InputMismatchException nfe) {
        		System.out.println("das war kein Integer - versuch es noch einmal");
        	}
		}
		System.out.println("und tschüss");

	}

}



