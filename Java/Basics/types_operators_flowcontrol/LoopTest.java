package types_operators_flowcontrol;

public class LoopTest {

	public static void main(String[] args) {
		
		int x = 2;
		
		for(int i = x; ; ) {
			System.out.println("hallo");
			
			i++;
			
			if(i==8)
				break;
		}
	}
}
