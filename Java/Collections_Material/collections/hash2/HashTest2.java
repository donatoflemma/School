package collections.hash2;

/*
wenn Objekt1 und Objekt2 gleich sind, m�ssen auch ihre Hashcodes gleich sein
wenn Objekt1 und Objekt2 ungleich sind, m�ssen ihre Hashcodes nicht zwangsl�ufig auch ungleich sein,
es ist jedoch wünschenswert.
*/


// Extended by a new attribute "age" to be used for equality check and hash generation


import java.util.*;


 class Cat {
    String name;
    int age;
    

    Cat (String name, int age) {
           this.name = name;
           this.age  = age;
    }
   
    //-----------------------------------
    // hashing
    //-----------------------------------
    public int hashCode() {
        return this.name.hashCode() + this.age;  // uses same set of attributes as equals()
        //return this.name.hashCode();  // uses only part of relevant attributes
    	//return 1; // very bad hash code
    }
    //----------------------------
    // eguals method to be implemented
    // this will avoid duplicates
    //-----------------------------
    public boolean equals(Object o) {
        if (o != null && o instanceof Cat) {
        	System.out.println("vergleich "+this.name+"  "+((Cat)o).name);
            return this.name.equals(((Cat)o).name) && this.age == ((Cat)o).age;
        }
        else
        {
        	System.out.println("else zweig");
            return false;
        }
    } //------------------------------------

}

 //---------------------------------------

 public class HashTest2 {
     static public void main(String... ar) {
         Set<Cat> catery = new HashSet<Cat>();
         catery.add(new Cat("Amadeus", 3));
         catery.add(new Cat("Amadeus", 5));
         catery.add(new Cat("Amadeus", 5));
         catery.add(new Cat("Snot", 15));
         catery.add(new Cat("Sooty", 7));
         catery.add(new Cat("Ginger", 9));
         catery.add(new Cat("Ginger", 8));
         catery.add(new Cat("Lioness", 2));
         catery.add(new Cat("Bronco", 1));
        
         System.out.println("--------------------------");
         for (Cat c : catery) {
             System.out.println(c.name + " " + c.age);
         }
     }
 }
 //---------------------------------------