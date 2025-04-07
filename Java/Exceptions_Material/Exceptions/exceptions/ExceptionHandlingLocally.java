package exceptions;

public class ExceptionHandlingLocally {
	
  public static void main(String[] args) {
	  
    String s = "123aa";  
    
    try {
      int i = Integer.parseInt(s);
      //hier Businesslogic
      System.out.println("Die Zahl ist " + i);
    }
    catch (NumberFormatException e)    {   
      System.out.println(s + " konnte nicht in eine Zahl umgewandelt werden.");
    }
    
  }
  
  
}
