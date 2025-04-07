package Java.donato.myproject;

import java.util.Scanner;

public class ProgrammflussZwei {
    public static void main(String[] args) {
        /*
         * Scanner input = new Scanner(System.in);
         * System.out.println("Aufgabe 1 - die Größte Zahl");
         * System.out.println("Bitte , geben Sie die erste Nummer ein:");
         * int a = Integer.parseInt(input.nextLine());
         * 
         * System.out.println("Bitte , geben Sie die zweite Nummer ein:");
         * int b = input.nextInt();
         * 
         * System.out.println("Bitte , geben Sie die dritte Nummer ein:");
         * int c = Integer.parseInt(input.nextLine());
         * 
         * if (a == b && a == c) {
         * System.out.println("Die drei Nummer sind gleich !!");
         * } else if (a > b && a > c) {
         * System.out.println(a + " ist die größte Zahl ");
         * } else if (b > a && b > c) {
         * System.out.println(b + "ist die größte Zahl ");
         * } else {
         * System.out.println(c + " ist die größte Zahl");
         * }
         * 
         * System.out.println("");
         * System.out.println("");
         * 
         * System.out.println("Aufgabe 2 - Schaltjahr");
         * System.out.println("Bitte , geben Sie ein Jahr ein:");
         * int jahr = Integer.parseInt(input.nextLine());
         * 
         * if (jahr % 4 == 0 && jahr % 100 != 0) {
         * System.out.println(jahr + " Schaltjahr");
         * } else if (jahr % 100 == 0 && jahr % 400 == 0) {
         * System.out.println(jahr + " Schaltjahr");
         * } else {
         * System.out.println(jahr + " nicht Schaltjahr");
         * }
         * 
         * System.out.println("");
         * System.out.println("");
         */
        System.out.println("Aufgabe 3 - Sternen");
        int counter = 17;
        for (int i = 0; i < 4; i++) {
            counter -= 4;
            for (int b = counter; b > 0; b -= 2) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }

}
