package types_operators_flowcontrol;

// new Switch syntax from Java 14 on



public class Switch_New_DayOfMonth {

	public static void main(String[] args) {
		
		int month = 2;
        int year  = 2025;
		
        int numDays =
		switch (month) {
			case 1,3,5,7,8,10,12 -> 31;
			case 4,6,9,11 -> 30;
		
			case 2 -> {
				if ( ((year % 4 == 0) && !(year % 100 == 0))||(year % 400 == 0))
			         yield 29;
			    else
			         yield 28;
			}
				default -> 0;
		};
	}
}

	
	

