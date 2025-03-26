package Java.donato.myproject;

import java.util.Scanner;

public class KapitalVerdoppelung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Startkapital
        System.out.println("Bitte , geben Sie den Startkapital ein:");
        int SK = Integer.parseInt(scanner.nextLine());
        // Zinssatz
        System.out.println("Bitte , geben Sie den Zinssatz ein:");
        int ZS = Integer.parseInt(scanner.nextLine());

        int jahr = 0;
        // verzinstes Kapital
        double Kapital = SK;
        while (Kapital < 2 * SK) {
            Kapital = Kapital * (1 + ZS / 100.0);
            jahr++;
        }
        System.out.println("Kapitalverdoppelt = " + (int) Kapital);
        System.out.println(" Kapitalverdoppelung nach " + jahr + "Jahren");
        scanner.close();
    }

}
