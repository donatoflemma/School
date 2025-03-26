package arrays;


class AnonymeArrayTest {

      //-------- test content -------------------------
      static void printArray(int... a) {
           for(int e : a) {
             System.out.println(e);
           }
        }
      //-----------------------------------------------
      static public void main (String[] s) {
          // implicite array init
          int[] b = {1,2,3};

          int[] c;
          // compiler error ! int[] c = {1,2,3}; must be one statement
          //c = {1,2,3};

          // onother valid syntax !!!
          c = new int [] {1,3,7};

          // passing an anonyme array
          printArray( new int[]  {1, 2, 5, 8, 9, 22}  );          

          // using Varargs
           printArray (10,20,30,40,50); // change:  "printArray(int... a);"
      }
      //-----------------------------------------------
}