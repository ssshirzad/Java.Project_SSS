package day.one;
import java.util.ArrayList;

public class BookArrayExample {
	
	public static void main(String[] args) {
		
		//Create and Array of Books
		ArrayList<Book> books = new ArrayList<Book>();
		
		Book book1 = new Book("Harry Potter 1");
		books.add(book1);
		
		Book book2 = new Book("Harry Potter 2");
		books.add(book2);
		
		System.out.println(books.size());
		
		for (int i = 0 ; i < books.size() ; i++) {
			Book returnedObj = books.get(i);
			System.out.println(returnedObj.getBookName());
		}

	}

}


