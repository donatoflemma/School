package exceptions.eigene;


//-------------------------------------------------------
//  eine eigene ExceptionKlasse
//  transportiert eine Message und die String-Länge
//-------------------------------------------------------
public	class MyException extends Exception {

     private int stringsize = 0;

     MyException(String s , int length) {
       super(s);
       stringsize = length;
     }
     //--------------------
     int getStringSize() {
         return stringsize;
     }
}

