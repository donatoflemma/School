package collections.list_set_map;

import java.util.ArrayList;

class ArrayListExamples { 
	public static void main(String args[]) { 
		ArrayList<String> a = new ArrayList <> (100); 
		a.add("One"); 
		a.add("Two"); 
		
		for(String s : a)
			System.out.print(s+ " ");
		
		
		System.out.println();
		System.out.println(a);
		
		System.out.println(a.contains("One")); // prints true
		System.out.println(a.indexOf("Two")); // prints 1
		a.clear(); // removes all elements
		System.out.println(a); // prints [], wierdly enough
		//System.out.println(a.get(9)); // IndexOutOfBoundsException
		
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		//intList.add("abc");
		intList.add(3);
		
		for(Integer x : intList)
			System.out.print(x+ ", ");
		
		
		
		//****************************
		

		
	} 
}
