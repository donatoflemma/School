package arrays;


import java.util.*;
import java.io.*;

//--------------------------------------------
//  1) all entered words stored in a String[]
//  2) sorting String
//  3) display the sorted content
//  4) search for a specific word - returns the
//     position in the String[]
//--------------------------------------------


class ArraySortAndSearch {

public static void main (String[] arg) throws IOException {
    String words;
    String[] strarray;
    System.out.print("Please enter words separated by blanks");
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    words = keyboard.readLine();
    strarray  = words.split("\\s");

    //------- now sort the array in natural order (strings alphabetically) -------
    Arrays.sort(strarray);

    //------- display it ---------------
    for (String s : strarray)
      System.out.println(s);
    
    

    //------ search for a specific word ---------
    String searchWord=" ";
    
    loop:
      while (true) {
        System.out.print("Word to search or 'quit' : ");
        searchWord = keyboard.readLine();
        
      if(searchWord.equals("quit")) {
    	  System.out.println ("goodbye");
    	  break;
      }
        
      if (searchWord.contains(" ")) {
        System.out.println ("please exactly one word and try again!!!");
        continue;
      }      
      
      else {
       int index = Arrays.binarySearch(strarray, searchWord);
         if (index < 0)  System.out.println("not found");
         else            System.out.println("found at position  " + (index+1) );
      }
     }
    }
}
