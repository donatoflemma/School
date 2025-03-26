package Java.Basics.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MitScanner {

	public static void main(String[] args) throws IOException {
		System.out.println("bitte ein Integer eingeben:  ");

		while (true) {
			Scanner s = new Scanner(System.in);
			String eingabe = s.next();

			// pr�fen ob der eingegeber String ein integer ist:
			try {
				Integer.parseInt(eingabe);
				System.out.println(eingabe + " Danke");
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("das war kein Integer - versuch es noch einmal");
			}
		}
		System.out.println("und tsch�ss");

	}

}
