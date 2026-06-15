package Activities;

public class Activity5 {
	public static void main(String[] args) {
		
		String title = "Bookname";
		
		Books newBook = new Book1();
		
		newBook.setTitle(title);

		
		System.out.println("The title is: " + newBook.getTitle());
	}
}