package collections.list_set_map;

// Keine Doubletten und sortiert.

import java.util.*;

class LottoZahlenSorted  {
  public static void main(String args[])    {
    int zahl, anzahl;
    Set <Integer> gezogen = new HashSet<>();  //LinkedHashSet<>();
    Random generator = new Random();

    System.out.println("\n Die Ziehung der Lottozahlen");

    anzahl = 0;
    while(anzahl < 6) {
      zahl=generator.nextInt(48)+1; // 1-49

      // versuchen, die Zahl in die Menge einzufuegen
      // falls nicht moeglich -> neue Zahl erzeugen
      
      //boolean success = gezogen.add(zahl);
      if(!gezogen.add(zahl)) {
            System.out.println("doppelt: " + zahl); // neuer Versuch
            continue;
      }

      // Zahl ausgeben
      System.out.println("Gezogene Zahl: " + zahl);
      // Sind 6 Zahlen gezogen worden? Dann Ende.
      anzahl++;
      }
      //----------unsortiert----------------------
     System.out.println("---------\n Unsortierte Ausgabe vom HashSet");
     for(Integer i : gezogen)
            System.out.println(i);


      // ---------sortieren von HashSet-----------
      System.out.println("---------\n Sortierte Ausgabe vom HashSet");
      TreeSet <Integer> ts = new TreeSet <Integer> (gezogen);
            
      for(Integer i : ts)
            System.out.println(i);
      //------------------------------------------

      System.out.println("---------\n");
    }
  }