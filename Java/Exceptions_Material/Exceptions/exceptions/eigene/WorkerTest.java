package exceptions.eigene;

import java.io.*;

class WorkerTest {

  public static void main (String args[])  throws Exception { //throws Exception

       WorkerClass wc = new WorkerClass();
       System.out.println("bitte text mit 4 Buchstaben eingeben:  ");

        while(true) {
           //einlesen von der Tastatur
           BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
           String eingabe = input.readLine();
           //kritischer Code
           try {
               wc.StringHandler(eingabe);
               System.out.println("danke");
           }
           catch(MyException me) {
               String error="aktuelle Stringlaenge ist :" + me.getStringSize() + " versuchen Sie es bitte noch einmal";
               System.out.println(error); 
               System.out.println(me.getMessage()); 
               //sle.printStackTrace();
           }

        }
  }
}

