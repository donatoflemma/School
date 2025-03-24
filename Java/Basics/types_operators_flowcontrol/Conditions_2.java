package types_operators_flowcontrol;

public class Conditions_2 {

	public static void main(String[] args) {

//		int a = 10, b = 122, c = 1000;
//
//		if (a == b)
//			System.out.println("action 1");
//		if (c != 100)
//			System.out.println("action 5");
//		else
//			System.out.println("action 4");
//
//		if (c != 100)
//			System.out.println("action 2");
//
//		System.out.println("action 3");
//		
		
		int i=11;
		//int result = 2 + (i < 10 ? i * 100 : i *10);		//502
		int result = 2 + i < 10 ? i * 100 : i *10 ; 		//500
		
		System.out.println(result);
	}

}
