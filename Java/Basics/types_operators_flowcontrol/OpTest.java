package types_operators_flowcontrol; 

class OpTest {
    public static void main(String [] args) {

      boolean x = true;
      boolean y = false;
      short z = 42;

     
      //System.out.println((y = true));

      if((z++ == 42) && (y == true))  
        z++;
      if((x == false) || (++z == 45)) 
        z++;

      System.out.println("z = " + z);
    }
  }

