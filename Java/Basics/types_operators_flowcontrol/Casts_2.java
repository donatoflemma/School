package types_operators_flowcontrol;



public class Casts_2 {
   public static void main(String[] args)        {

                int y,x;
                double z1,z2,z4;
                x=3;
                y=4;
                z1=(double)(x/y); // Versuch: ohne casting(double)
                z2=3/4.;
                int b =(int)(3/4.0);
                z4=3.0/4.0;

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z4);

        System.out.println(b);
        System.out.println((double)b);
        
        String str = "text";
        
       String s = 5.1+5*4+""+1;  //
       System.out.println(s);
      }
    }