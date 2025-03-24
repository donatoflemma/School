package types_operators_flowcontrol;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandor
 */
public class LoopLabelTest {

static public void main (String...a) {
    
    xy:    
    for (int j = 0; j < 10; j++) {
                System.out.println("----> "+j);
                
                for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                        if (i==5){
                        		//continue;
                                //continue xy;
                                //break;
                        		break xy;
                        }                        
                        System.out.println("xxxx"+j); 
                }
    }

}

}