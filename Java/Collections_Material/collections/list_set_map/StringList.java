package collections.list_set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		List <String> a = new ArrayList<>() ;
		a.add("Zero");
		a.add("One");
		a.add("Two");
		a.add("Three");
		
		System.out.println(a.contains("One"));
		System.out.println(a.get(3));
		System.out.println(a.indexOf("Three"));
		
		System.out.println("removed: "+ a.remove(1));
		System.out.println("nachgerückt: "+ a.get(1));
		System.out.println("previous element was: " + a.set(1, "99"));
		
		System.out.println("---------------");
		for (String s : a)
			System.out.println(s);
		
		Collections.sort(a);
		
		System.out.println("---------------");
		for (String s : a)
			System.out.println(s);

	}

}
