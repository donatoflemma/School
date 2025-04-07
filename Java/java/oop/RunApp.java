package Java.java.oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RunApp {
    // Questo é il main che fa partire la classe che abbiamo creato
    public static void main(String[] args) {
        // ora creiamo il primo oggetto di questo tipo di classe
        // Book book1 = new Book("Moby Dick","Herman Melville",25.40);
        // Book book2 = new Book("Steppenwolf","Hermann Hesse",15.30);
        // Book book3 = new Book("Java ist auch eine Insel","Christian
        // Ullenboom",45.40);
        // Book book4 = new Book("fahrenheit 451","Ray Bradbury",65.30);
        // Book book5 = new Book("Moderne Softwarwe-Etwiklung mit Java und JEE ","Stefan
        // Wagenpfeil",44.30,200,"Thriller");

        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);
        // System.out.println(book4);
        // System.out.println(book5);

        // Dopo aver creato gli oggetti andiamo a creare una lista per inscrivere gli
        // elementi nella lista
        // ArrayList books = nem ArrayLIst();
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("Moby Dick", "Herman Melville", 25.30));
        books.add(new Book("Steppenwolf", "Hermann Hess", 15.40));
        books.add(new Book("Java ist auch eine Insel", "Christian Ullenboom", 45.10));
        books.add(new Book("Herr der Fliegen", "William Golding", 7.90));
        books.add(new Book("Fahrenheit451", "Ray Bradbury", 20.60, 200, "Thriller"));

        for (Book b : books)
            System.out.println(b);

        Book book = books.get(0);
        book.setSeitenzahl(100);
        System.out.println(book.getSeitenzahl());

        // Preis erhöhen
        for (Book b : books)
            b.increasePriceByPercent(5);

        Collections.sort(books);

        for (Book b : books)
            System.out.println(b);

        // Book[] bookArray = new Book[books.size()];
        // Object[] bookArray = books.toArray();
        // System.out.println(bookArray[0]);
    }
}
