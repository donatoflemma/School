package Java.java.oop.ProvaOop;

// questa é la nostra main dove andiamo a creare gli ogetti
public class Esempio {
    public static void main(String[] args) {
        // ora creamo una var in cui creamo l´ogetto con le proprieta del costruttore Televisore
        var Televisore01 = Televisore (marca:"LG",dimenione:"nero",dimenione:55);
        // dopo averla dichiarata al momento non possiamo stampare le proprieta dell´oetto creato 
        // per cui andiamo a inserire nel costruttore quello che si chiamano i "getter"
        //  per gli attributi che non cambiano e Setter per l´atributo che non é private final 
        // podo aver fatto tutto ora posso stampare le proprietá
        System.out.println(Televisore01.getMarca() + " " + Televisore01.getColore() + " " + Televisore01.getdimensione() );
    }
}
