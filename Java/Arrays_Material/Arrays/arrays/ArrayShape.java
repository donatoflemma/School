package arrays;


class ArrayShape {

static public void main (String[] s) {

int[] myArr = {1,2,3,4};    //new int[5];
	
int[][] a = {     {1},
                 {2,3},
                {4,5,6},
               {7,8,9,10}
            };
  int elements=0;

  	 for (int i=0; i< a.length; i++ )  {
       elements += a[i].length;
     }
  System.out.println("Anzahl der Elemente :  " + elements);
  }
}