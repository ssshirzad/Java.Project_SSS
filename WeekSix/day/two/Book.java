package day.two;

public class Book {
	String writer;
	String year;
	int pages;
	double price;
	
	public Book(String writer, String year, int pages, double price) {
		this.writer = writer;
		this.year = year;
		this.pages = pages;
		this.price = price;
		
	}
	
	public void printBookInfor() {
		System.out.println(writer + ' '+ year + ' '+ pages + ' '+ price);
		
	}
	public double sellBook(double price) {
		this.price = price;
		return price;
	}

}
