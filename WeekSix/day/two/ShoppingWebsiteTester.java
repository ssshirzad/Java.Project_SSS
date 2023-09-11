package day.two;

public class ShoppingWebsiteTester {
	public static void main(String[] args) {
		ShoppingWebsites amazon = new ShoppingWebsites("www.amazon.com"); 
		amazon.goTo();
		ShoppingWebsites bestBuy = new ShoppingWebsites("www.bestbuy.com");
		bestBuy.goTo();
		
	}
	
	

}
