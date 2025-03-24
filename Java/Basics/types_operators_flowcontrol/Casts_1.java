package types_operators_flowcontrol;



public class Casts_1 {

	public static void main(String[] args) {
		int intVar = 1;
		long longVar = intVar;
		intVar =  (int) longVar;
		
		float f1 = longVar;
		float f2 =  (float) 2.3;
		double din = f1;
		long lv2 = 100000000000L;
		float f3 = lv2;
		
		accept((int)f1);
	}
	
	public static void accept(int d) {
		
	}

}
