package types_operators_flowcontrol;

// file: OpDemo.java

public class OpDemo   {

 public static void main(String[] args)    {

   int x,y,z;
   int ergebnis_1,ergebnis_2;
   x = 1; y = 2; z = 3;
   ergebnis_1 = x + y * z; // 4
   ergebnis_2 = (5 - 3) * z; // 7
   System.out.println(ergebnis_1);
   System.out.println(ergebnis_2);
   x = x + z; //8
   System.out.println(x);
   x += z; //9
   System.out.println(x);
   x += 1; //10
   System.out.println(x);
   x++; //9
   System.out.println(x);
   y=x++; //11
   System.out.println(x);
   System.out.println(y);
   y=++x;//11
   System.out.println(x);
   System.out.println(y);
   }
 }
 // Rivedere questo esercizio con i suoi incrementi , in quanto non ne ho capito un cazzo 