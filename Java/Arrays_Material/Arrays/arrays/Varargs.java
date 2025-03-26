package arrays;

	class Varargs {
	
	public static void main(String... args) {
	
	System.out.println(sum(1,2,3));
	System.out.println(sum(20,21));
	
	int[] a = new int[3];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	
	System.out.println(sum(a));
	System.out.println(summe(a));
	System.out.println(method(5,2,5,6));
	}
	//-----
	public static int sum(int... args) {
	        int erg = 0;
	        for (int x : args) 
	        	erg = erg + x; 
	        return erg;
	}
	//-----
	public static int summe(int[] args) {
	        int erg = 0;
	        for (int x : args) { erg = erg + x; }
	        return erg;
	}
	//-----
	public static int method(int a, int... summanden) {
	    return summanden[0]*a;
	}
	//-----
	}