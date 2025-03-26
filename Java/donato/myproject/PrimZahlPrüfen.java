package Java.donato.myproject;

import java.util.Scanner;

public class PrimZahlPrüfen {
    public static void main(String[] args) {
        System.out.println("Bitte, geben Sie ein Nummer ein ,\n um das als Primerzahl zu prüfen");
        Scanner Userinput = new Scanner(System.in);
        String Number = Userinput.nextLine();
        // System.out.print(Number);
        int NumberUser = Integer.parseInt(Number);
        boolean Ergebnis = true;

        if (NumberUser < 2) {
            System.out.println(NumberUser + " Es ist keine Primer Nummer");
            Ergebnis = false;
        } else {
            for (int i = 2; i < Math.sqrt(NumberUser); i++) {
                if (NumberUser % i == 0) {
                    Ergebnis = false;
                    break;
                }

            }
        }
        if (Ergebnis) {
            System.out.println(Number + " Es ist a Primer Zahl");
        } else {
            System.out.println(Number + " ist nicht eine Primer Zahl ");
        }
    }
}
