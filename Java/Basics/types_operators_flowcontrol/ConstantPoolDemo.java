package types_operators_flowcontrol;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandor
 */
public class ConstantPoolDemo {
    public static void main(String... ar) {

        // Referenzgleichheit nur by Auto Boxing
    	// not by Integer i1 = new Integer(4);
        
    	Integer i1 = 4;
        Integer i2 = 4;
        //------------
        Integer i3 = -129;
        Integer i4 = -129;
        System.out.println("i2 == i1 = " + (i1 == i2));
        System.out.println("i3 == i4 = " + (i3 == i4));

    String s1 = "hallo";
    String s2 = "hallo";
    System.out.println("s1 == s2 = " + (s1 == s2));

    String s3 = new String("hallo");
    System.out.println("s1 == s3 = " + (s1 == s3));
    String s4 = new String("hallo");
    System.out.println("s3 == s4 = " + (s3 == s4));



}
}