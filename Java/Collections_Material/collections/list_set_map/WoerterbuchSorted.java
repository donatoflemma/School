package collections.list_set_map;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class WoerterbuchSorted {
  public static void main(String args[]) {
    Map <String,Value> map = new HashMap<>(); //LinkedHashMap<>();
    map.put("laufen", 			new Value("run","Verb"));
    map.put("laufend",			new Value("run","Verb"));
    map.put("gehen", 			new Value("go","Verb"));
    map.put("gehen", 			new Value("walk","Verb"));
    map.put("schwimmen", 		new Value("swim","Verb"));
    map.put("reissverschluss", 	new Value("zipper","Nomen"));

    //------ 
    
    System.out.println("\n-------- a) unsorted, using toString() von HashMap ---------");
    System.out.println(map);    
   
    System.out.println("\n-------- b) unsorted, printing Key and Value  ---------");    
    Set<Map.Entry<String, Value>>  entrySet1 = map.entrySet(); //entry view of the collection    
    
    for(Map.Entry mapEntry : entrySet1) {
    	System.out.println(mapEntry.getKey() +"   "+ ( (Value)mapEntry.getValue()).wort);
    }
    
    System.out.println("\n-------- c) sorted, using toString() von TreeMap  ---------");
    TreeMap<String,Value> treeMap = new TreeMap<>(); 
    treeMap.putAll(map);
    System.out.println(treeMap);    
    
    System.out.println("\n-------- d) sorted, printing Key and Value  ---------");
    Set<Map.Entry<String, Value>> entrySet2 = treeMap.entrySet(); //entry view of the collection
    for(Map.Entry mapEntry : entrySet2) {
    	System.out.println(mapEntry.getKey() +"   "+ ( (Value)mapEntry.getValue()).wort);
    }
  }
}

class Value {
  @Override
	public String toString() {
		return "Value [wort=" + wort + ", typ=" + typ + "]";
	}

String wort, typ;

  Value(String w,String t) {
    wort = w;
    typ = t;
    }
 }

