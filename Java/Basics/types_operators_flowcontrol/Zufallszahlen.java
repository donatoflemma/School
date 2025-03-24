package types_operators_flowcontrol;

import java.util.Random;

public class Zufallszahlen {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(50)); // inclusive 0, exclusive 50
		}
		
		System.out.println("-".repeat(10));
		
		// alternative: Math.random()		
		for(int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 6) + 1); // inclusive 1, exclusive 7
		}
		
	}
}
