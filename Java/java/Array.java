package Java.java;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // gli Arrey in Java sono particolari
        // si deve dichiarare il tipo di contenuto e il numero
        // lista con 3 elementi integer
        int[] numeri = new int[3];
        // inserimento di numeri per ogni index
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println(Arrays.toString(numeri));
        System.out.println(numeri.length);
        System.out.println(numeri[0]);

        // inserimento di altre cifre negli index
        numeri[0] = 33;
        System.out.println(numeri[0]);
        System.out.println(Arrays.toString(numeri));

        int[] altroTipo = { 10, 20, 30 }; // Creo e inizializzo direttamente l’array

        // FAI ATTENZIONE A QUESTI PASSAGGI

        // SBAGLIATO
        // int[] numeri;
        // numeri = {10, 20, 30}; // Errore! Devi usare "new int[]"

        // GIUSTO
        // int[] numeri;
        // numeri = new int[]{10, 20, 30}; // Qui funziona

        // Zwei Dimensional Array
        int[][] arr1 = {{4,8},{3,9},{4,16}};

        int[][] arr2= new int [3][]; // la prima [] deve essere dichiarata , la seconda puo essere tralasciata

        int[] a = {2,5,6};
        int[] b = {2,5,6};
        int[] c = {2,5,6};
        arr2[0] = a;
        arr2[1] = b;
        arr2[2] = c;
        /*------------------------------------------------------------------------------------------ */
        print(altroTipo);
    }
    // ho creato un methode per cambiare un elemeto nella lista , uguale alla def di python
    public static void print(int[] i) {
        i[0] = 3;
    }
}
