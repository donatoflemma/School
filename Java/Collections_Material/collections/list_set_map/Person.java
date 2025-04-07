package collections.list_set_map;

import java.util.Date;

public class Person  {  // implements Comparable
	
	//fields
	private int age = 0;
	private String surname = "Unknown";
	private final Date dateAdded = new Date();
	private static int personCount;
	
	static {
		personCount = 0;
	}
	
	public Person (int age, String surname) {
		this(surname);
		this.age = age;
	}
	
	public Person(String surname) {
		this();
		this.surname = surname;
	}
	
	//this is not the default constructor
	private Person() {
		personCount++;
	}

	public String getSurname() {
		return surname.toUpperCase();
	}
	
	public String getSurname(String title) {
		return title + " " + surname;
	}
	
	int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateAdded() {
		String prefix = "Date info accessed: ";
		System.out.println(prefix);
		{
			int x = 7;
			prefix = "blah";
		}
		System.out.println(prefix);
		return dateAdded;
	}

	public static int getPersonCount() {
		return personCount;
	}

	@Override
	public String toString() {
		return "Name: " + surname + 
				" Age: " + age +
				" Created: " + dateAdded;
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
}
