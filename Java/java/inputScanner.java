package Java.java;

// Prima cosa per creare un input é importare il modulo per poterlo fare 
import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        // sto chiamando la variabile che mi permette di prelevare cio che scrie L´User
        Scanner richiesta = new Scanner(System.in);

        System.out.println("Qual´é il tuo nome ?");
        // creo un´altra variabile dove salvare l´input dell´user
        String nome = richiesta.nextLine();

        System.out.println(nome);

    }

}
