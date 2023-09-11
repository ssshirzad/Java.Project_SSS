package day.two;

public class BookTester {
	public static void main(String[] args) {
	Book sahih = new Book("Ibn", "1992", 400, 21.99);
	sahih.printBookInfor();
	
	
	double sell = sahih.sellBook(19.99);
	System.out.println(sell);
	
	
	
	}
	
	

}
