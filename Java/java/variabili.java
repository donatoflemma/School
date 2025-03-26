package Java.java;

public class variabili {
    public static void main(String[] args) {
        int x; // dichiarazione

        String nome;

        double temporatura;

        x = 45; // assegnazione
        System.out.println(x);

        nome = "Luca";
        System.out.println(nome);

        temporatura = 34.23;
        System.out.println(temporatura);

        int y = 35; // inizializzazione , fare cosi é fare entrambe le cose di prima
        System.out.println(y);

    }

    /* TIPI DI DATI : PRIMITIVI E REFERENCE */
    public static void tipiDati(String[] args) {
        /* VARIABILI PRIMITIVE */
        // incominciano sempre con la maiuscola
        boolean luce = false;
        System.out.println(luce);
        // i boolean possono solo sempre o veri o falsi
        // dimensione 1 bit, quindi 0 o 1

        byte ilByte = -128;
        System.out.println(ilByte);
        // Occupa un byte e seve per salvare i numeri
        // ha un´estensione che va da -128 a 127
        // é 127 e non 128 perche ci sta anche lo 0

        short loShort = -32768;
        System.out.println(loShort);
        // occupa 2 bytes e ha un´estenzione che va da -32768 a 32767

        int ilInt = 4568;
        System.out.println(ilInt);
        // se il numero é grande si puo scrivere con Underscore : 2_000_000_000_000
        // viene comunque stampato
        // occupa 4 bytes -2 miliardi a 2 miliardi

        long Lungo = 4_654_865_186_168_545_623L;
        System.out.println(Lungo);
        // ricordati di mettere una L per essere scritti
        // occupa 8 bytes e va da -9 quintilioni a 9 quintilioni

        float ilFloat = 3.456455f;
        System.out.println(ilFloat);
        // numero con 6-7 cifre decimali 4 Bytes, 5.123526f per determinare che é un
        // float

        double ilDouble = 5.56564846846;
        System.out.println(ilDouble);
        // numero con 15 cifre decimali 8 bytes

        char ilChar = 'f';
        System.out.println(ilChar);
        // ricorda che il char va fatto con i singoli apici
        // quelli doppi sono per le Strfinge
        // puo contenere :singolo carattere / lettere/ ASCII 'f' | 2 byte

        /* REFERENCE */
        // Tipi di datic che creiamo noi , Parte sempre con la lettera Maiuscola per
        // dichiararla
        String laStringa = "vjfkdtfkvugkbubo";
        laStringa.length();
        // Queste tipi di variabili se s´inserisce un punto parte le varie funzioni che
        // possiamo aggiugere
        // insieme di caratteri dimensione variabile in base alla dimensione

    }

}