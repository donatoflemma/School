package collections.list_set_map;

// Datei: CWoerterbuch.java
import java.util.*;
import java.io.*;

public class Woerterbuch
  {
  public static void main(String args[])
    {
    HashMap<String, Item> map = new HashMap<>();//<String, Item>
    map.put("gehen",new Item("walk","Verb"));
    map.put("laufen",new Item("run","Verb"));
    map.put("schwimmen", new Item("swim","Verb"));
    map.put("Reissverschluss", new Item("zipper","Nomen"));
    map.put("gehen",new Item("go","Verb"));

    // das gesuchte Wort
    BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Deutsches Wort: ");
    String suchString;
    try {
      suchString = tastatur.readLine();
      }
    catch(IOException e)  { return; }

    // nachschlagen
    Item ergebnis = (Item)map.get(suchString); //
    if(ergebnis == null)
     System.out.println(suchString + "  nicht gefunden!");
    else
     System.out.println(suchString + " heisst auf englisch: " + ergebnis.wort);
    }
}

class Item
  {
  String wort, typ;

  Item(String w,String t)
    {
    wort = w;
    typ = t;
    }
  }