package types_operators_flowcontrol;



public class Looper {

	public static void main(String[] args) {
		
		int i = 1;
		
		for (; i <= 5; i++) 
			System.out.println(i);
		
		
		System.out.println("---");
		
		while (i++ <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(i +"<---");
		
		do 
			System.out.println(i);
		while(i < 11);
	}

}
