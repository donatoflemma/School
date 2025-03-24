package types_operators_flowcontrol;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandor
 */
public class NumericPromotionTest {
    public static void main(String... args) { 
        
    //------- Numeric Promotion --------
    
    int ageYears =32;
    //int ageDays = ageYears * 365;
    long ageMiliSeconds = ageYears * 365 * 24 * 60 * 60 * 1000 ;  // �berlauf
    System.out.println(ageMiliSeconds);    
    
    //long ageMiliSeconds1 = 1L * ageYears * 365 * 24 * 60 * 60 * 1000 ; 
    
    long ageMiliSeconds1 = ageYears * 365 * 24 * 60 * 60 * 1000 + (long)10;  // auch Überlauf
    System.out.println(ageMiliSeconds1);    
    System.out.println("------------------------------"); 
 }
}
