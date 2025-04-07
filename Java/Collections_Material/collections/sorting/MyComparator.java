package collections.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

    private int mode = 0;
    
    MyComparator(int mode) {
        this.mode = mode;
    }  
    
    @Override
     	public int compare(Person p1, Person p2) {
    	switch(mode) {
  	     	//sort by the lenth of name
            case 0: return p1.name.length() - p2.name.length(); 

 	     	//sort alphabetically
            case 1: return p1.name.compareTo(p2.name);  
       
   	  	//sort by age
            case 2: return p1.age - p2.age;   
 
 		// this will not sort at all
  		default: return 0;
 	}
   	}
} 

