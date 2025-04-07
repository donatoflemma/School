package Java.java;

import java.util.ArrayList;
import java.util.Collection;

public class String {
    public static void main(String[] args) {
        // List Demo
        // ArrayList myList = new ArrayList();
        // capire la differenza tra i due tipi
        ArrayList<String> myList = new ArrayList<>();
        myList.add("zero");
        myList.add("one");
        myList.add("two");
        myList.add("three");

        myList.add(2);// mi da errore perch eho configurato laa mia lista per le stringhe

        Collection.sort(myList);
        System.out.println(myList);

        System.out.println(myList.contains("one"));
        System.out.println(myList.get(2));
        System.out.println(myList.indexOf("three"));
        System.out.println(myList.remove(1));
        System.out.println(myList.size());
        System.out.println(myList);
        System.out.println(myList.set(1, "hallo"));
        System.out.println(myList);

        for (String s : myList)
            System.out.println(s);

        String s = stringList.get(4);
        System.out.println(s);

    }
}
