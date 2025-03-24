package types_operators_flowcontrol;



public class Loops {

	public static void main(String[] args) {
		
	
		int count;
		String[] arr = {"One","Two","Three","Four"};
		
		//-----------
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		//-----------
		for(String out : arr)
			System.out.println(out);
		//-----------
//		count = 1;
//		while (count < 10) {
//			count++;
//			if (count % 2 == 0) {
//				System.out.println(count);
//				//break;
//				continue;
//			}
//				System.out.println("--");
//			}
//		}
		//-----------
		count = 1;
		do  {
			count++;
			if (count %2 == 0) {
				System.out.println(count);
				//break;
				continue;
			}
		}while (count < 1);
	}
	
}
