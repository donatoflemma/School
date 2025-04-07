package Java.java.oop;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("zero");
		myList.add("one");
		myList.add("two");
		myList.add("three");

		// myList.add(2);

		Collections.sort(myList);
		System.out.println(myList);

		System.out.println(myList.contains("one"));
		System.out.println(myList.get(2));
		System.out.println(myList.indexOf("three"));
		System.out.println(myList.remove(1));
		System.out.println(myList.size());
		System.out.println(myList);
		System.out.println(myList.set(1, "hallo"));
		System.out.println(myList.toString());

		for (String s : myList)
			System.out.println(s);
	}
}
