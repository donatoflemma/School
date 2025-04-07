package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersons {
    
	static List<Person> persons = new ArrayList();    
    
    static public void main(String... s) {
        persons.add(new Person("Sandor", 35));
        persons.add(new Person("Anton", 41));
        persons.add(new Person("Jahn", 25));
        persons.add(new Person("Lars", 16));
        persons.add(new Person("Malte", 23));
        
        // sort by natural order
        // Collections.sort(persons);  
        
        // sort by a given order
        Collections.sort(persons, new MyComparator(2));  
        
        for(Person p : persons) 			         
            System.out.println(p.toString());
    }
}

