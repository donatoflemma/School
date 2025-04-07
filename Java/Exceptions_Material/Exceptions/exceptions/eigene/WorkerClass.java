package exceptions.eigene;

//-------------------------------------------------------
//  prüft die länge des �bergebenen Strings
//  wirft eine eigene Exception, wenn String-Länge != 4
//
//--------------------------------------------------------


public class WorkerClass {

//--- diese Methode wirft Exception wenn die Stringlänge nicht 4 ist
  static int StringHandler(String str) throws MyException { 

        if ( str.length() != 4 )
           throw new MyException( " StringLengthException:  4 Digits erwartet !",
                                              str.length());
        else
           return str.length();
}
}

//-------------------------------------------------------