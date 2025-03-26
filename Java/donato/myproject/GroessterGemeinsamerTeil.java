package Java.donato.myproject;

import java.util.Scanner;

public class GroessterGemeinsamerTeil {
    public static void main(String[] args) {
        System.out.println("Bitte , Geben Sie die erste Nummer ein:");
        Scanner erste = new Scanner(System.in);
        int m = Integer.parseInt(erste.nextLine());

        System.out.println("Bitte , Geben Sie die zweite Nummer ein:");
        Scanner zweite = new Scanner(System.in);
        int n = Integer.parseInt(zweite.nextLine());

        int r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
            System.out.println("m =" + m + " n =" + n);
        }
        System.out.println(n + " Das ist die Groesster Gemeinsam Teil ");
    }
}
