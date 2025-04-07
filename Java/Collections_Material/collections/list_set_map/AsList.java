package collections.list_set_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class AsList {

	public static void main(String[] args) {
		
//		Person[] p = new Person[100];
//		p[0] = new Person("Ted");
//		p[1] = new Person(99,"Jed");
//		
//		//Person[] p = {new Person("Ted"), new Person(99,"Jed")};	
//		List<Person> names =  Arrays.asList(p);		
//		for (Person n : names)
//			System.out.println(n);
//        // ---- try this ----
//        //names.add(2, new Person("xy")); // run time exception
//	
		
		
		
//************ Testing asList **************		
		String[] stringArray = {"one", "two", "three", "four", "five"};
		for(String s: stringArray )
        	System.out.println(s);
		
		System.out.println("-----------------");
		
		List<String> stringList =  Arrays.asList(stringArray);
		stringList.set(4, "www");
		//stringList.add(0, "aaa");
		//stringList.remove(0);
		
        Collections.sort(stringList);
        
        for(String s: stringList )
        	System.out.println(s);
        
        
        String s = stringList.get(4);
        System.out.println(s);
	}

}
