package collections.sorting;

class Person implements Comparable<Person> {    
    String name = "";
    int age;   
    
    Person(String name, int age) {
	 	this.age = age;
	 	this.name = name;
    }
    
    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
    
//    @Override
//    public int compareTo(Person p) {
//        return this.age - p.age;
//    } 

    
    @Override
    public String toString(){
        return name+" \t| age: "+ age;
    }
}

