package types_operators_flowcontrol;

public class OpShortCircuitAndDemo {
	
	private static Book2 book;// = new Book();

	public static void main(String[] args) {		
		
		if(		book != null && 
				book.isAuthorEmpty() && 
				book.isTitleEmpty()   ) 
		{
			System.out.println("we can now set up this Book object");
		}
		System.out.println("ok");
	}
	
	

}

class Book2 {
	private String author = "";
	private String title = "";
	
	public boolean isAuthorEmpty() {
		return author.isEmpty();
	}
	
	public boolean isTitleEmpty() {
		return title.isEmpty();
	}
}
