package Java.java.oop.ProvaOop;

// esempio per costuire una Oop
public class esempioOop {
    // Per primo si dichiarano gli attributi degli ogetti
    private final String marca;
    private final String colore;
    private final int dimensione;
    // con final e private gli attributi non andranno ad essere cambiati
    private int canaleSelezionato;

    // a differenza degli altri questo cambia
    // questi sono i getter
    public String getMarca() {
        return marca;
    }

    public String getColore() {
        return colore;
    }

    public int getdimensione() {
        return dimensione;
    }

    // Questo é il Setter
    public void setCanaleSelezionato(int canaleSelezionato) {
        this.canaleSelezionato = canaleSelezionato;
    }

    // Costruzione del costruttore
    public Televisore(String marca, Stringc colore, int dimenione ){
        // Come con Python andiamo a dichiarare le proprieta nel costruttore
        this.marca = marca;
        this.colore = colore;
        this.dimensione = dimenione;

        canaleSelezionato = 0; // non usiamo this cosi si puo cambiare sempre
    }
}
