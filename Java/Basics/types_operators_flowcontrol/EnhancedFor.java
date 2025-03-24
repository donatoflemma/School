package types_operators_flowcontrol;

import java.util.*;


public class EnhancedFor {



public static void main(String[] args) {

ArrayList list = new ArrayList();
 list.add("str_1");
 list.add("str_2");
 list.add("str_3");
 list.add("str_4");
 capitalizeAll(list);
 }

//------ old -------------

static void capitalizeAll(Collection c) {
        for (Iterator I = c.iterator(); I.hasNext(); ) {
                System.out.println(((String)I.next()).toUpperCase());
        }
}
/*
//-------new 1 -------------
static void capitalizeAll(Collection c) {
        for(Object o : c) {
              System.out.println(((String)o).toUpperCase());
              }
}
*/
//-------new 2 -------------
/*
static void capitalizeAll(Collection <String> c) {
        for(String s : c) {
              System.out.println(s.toUpperCase());
              }
}
*/
//------------------------
}