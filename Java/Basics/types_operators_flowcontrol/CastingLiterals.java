package types_operators_flowcontrol;

import javax.swing.JOptionPane;

public class CastingLiterals {

	public static void main(String[] args) {
		
		byte b;
		int i = 126;
		b = 126; 				//no cast because literals are checked by the compiler. But try 129
		b =   (byte)i;  		// we need to cast
		
		
		char ch = 'K';	 		// no cast because literals are checked by the compiler	
		short n =  (short) ch; 	// we need to cast
				
		n = 'K';      			// no cast because literals are checked by the compiler 
		ch = 'K';
		n = '\u7000'; 			// no cast because literals are checked by the compiler . But try '\u8000'
		ch = (char)n;			// we always need to cast between char<->short<->byte
	
		System.out.println(ch);

	}
}
