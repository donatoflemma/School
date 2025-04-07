package Java.donato.myproject;

import java.util.Arrays;

public class Programmfluss_2 {
    public static void main(String[] args) {
        /*
         * System.out.println("Ubung 1");
         * for (int i = 1; i < 51;i++){
         * if(i % 2 == 1){
         * System.out.print(i + "-");
         * }
         * }
         */

        System.out.println("Ubung 2");
        int range = 100;
        int[] primerZahl = new int[range];
        for (int i = 0; i <= range; i++) {
            int counterTeilen = 0;
            for (int Teiler = 1; Teiler <= i; Teiler++) {
                if (i % Teiler == 0) {
                    counterTeilen++;
                    // System.out.print(i + " - ");
                    if (Teiler == i & counterTeilen == 2) {
                        System.out.print(i + " - ");
                        primerZahl[i] = i;

                    }
                }

            }
        }
        int maxnum = 0;
        for (int num : primerZahl) {
            if (maxnum < num) {
                maxnum = num;
            }
            System.out.println(maxnum);
        }
    }
}
