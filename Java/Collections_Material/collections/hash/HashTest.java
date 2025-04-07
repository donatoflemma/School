package collections.hash;

/*
wenn Objekt1 und Objekt2 gleich sind, m�ssen auch ihre Hashcodes gleich sein
wenn Objekt1 und Objekt2 ungleich sind, m�ssen ihre Hashcodes nicht zwangsläufig auch ungleich sein,
es ist jedoch wünschenswert.
*/



import java.util.*;


 class Cat {
    String name;

    Cat (String name) {
           this.name = name;
    }
    
    //-----------------------------------
    // the world's most efficient hashing
    //-----------------------------------
//    @Override
//    public int hashCode() {
//        //return 8;  
//        return this.name.hashCode();
//    }
    //----------------------------
    // eguals method to be implemented
    // this will avoid duplicates
    //-----------------------------
//    @Override
//    public boolean equals(Object o) {
//        if (o != null && o instanceof Cat) {
//        	System.out.println("vergleich "+this.name+"  "+((Cat)o).name);
//            return this.name.equals(((Cat)o).name);
//        }
//        else
//        {
//        	System.out.println("else zweig");
//            return false;
//        }
//    } //------------------------------------

}

 //---------------------------------------

 public class HashTest {
     static public void main(String... ar) {
         Set<Cat> catery = new HashSet<Cat>();
         catery.add(new Cat("Amadeus"));
         catery.add(new Cat("Amadeus"));
         catery.add(new Cat("Amadeus"));
         catery.add(new Cat("Snot"));
         catery.add(new Cat("Sooty"));
         catery.add(new Cat("Ginger"));
         catery.add(new Cat("Ginger"));
         catery.add(new Cat("Lioness"));
         catery.add(new Cat("Bronco"));
        

         
         System.out.println("--------------------------");
         for (Cat c : catery) {
             System.out.println(c.name);
         }
     }
 }
 //---------------------------------------