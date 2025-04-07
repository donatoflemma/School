package Java.java.oop;

public class Book implements Comparable<Book> {
    // capire che significa implements e Comparable
    // ovviamente le classi non necessitano del main perche devono essere chiamate
    // solo quando servono
    int seitenzahl;
    String titel;
    double preis;
    String genre;
    String autor;

    // questo é il costruttore che andrá a creare gli oggetti
    // se vedi li sta mettendo in ordine a suo piacere
    // anche se abbiamo diciarato piu variabili , si puo inserire dopo in quanto
    // l´importante é gli attributi nel costruttore
    public Book(String titel, String autor, double preis) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;

    }

    public Book(String titel, String autor, double preis, int seitenzahl, String genre) {
        // questo é la chiamata al costruttore precedente
        this(titel, autor, preis);
        this.seitenzahl = seitenzahl;
        this.genre = genre;

    }

    // a qaunto pare é importante riscriverla di novo ma vuota o mi da problema ,
    // farfci una ricerrca al riguardo
    // public Book(){}

    @Override
    // capire che significa Override
    public String toString() {
        // ha creato semplicemente una String verkettung in modo da stampare il titolo e
        // il resto
        return "Book [titel= " + titel + ", author = " + autor + ", preise = " + preis + ",genre =" + genre
                + ",seitenzahl=" + seitenzahl + "]";
    }

    public int getSeitenzahl() {
        return seitenzahl;
    }

    public void setSeitenzahl(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return autor;
    }

    public void setAuthor(String author) {
        this.autor = author;
    }

    public void increasePriceByPercent(double percent) {
        preis *= (1 + percent / 100); // 1+ 0,2, weil obe 2 Prozent eingegebene woird
    }

    @Override
    // l´ho fatto quando alla classe Book "implements Comparable<Book>" queste
    // parole ho aggiunto
    public int compareTo(Book b) {
        if (this.preis < b.preis)
            return 1;
        if (this.preis > b.preis)
            return -1;

        return 0;
    }
}
