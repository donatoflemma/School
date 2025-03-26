
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MitOptionPane {

	public static void main(String[] args) {

		String dialogText = "Bitte integer Zahl eingeben";
		while (true) {
			try {
				String eingabe = JOptionPane.showInputDialog(dialogText);
				Scanner s = new Scanner(eingabe);
				int myInt = s.nextInt();
				s.close();
				JOptionPane.showMessageDialog(null, "Die Zahl ist: " + myInt + "\nDanke und Tsch�ss  ");
				break;

			} catch (InputMismatchException nfe) {
				dialogText = "das war kein Integer - versuch es noch einmal  ";
			} catch (NullPointerException npe) {
				System.out.println("Terminated");
				break;
			}

		}
	}
}
