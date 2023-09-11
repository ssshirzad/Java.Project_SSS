package day.three.practice;

public class Activity2 {

	
	public static void main(String[] args) {
		
		String make = "Ford";
		double price = 30000;
		int warranty = 84;
		
		if(make.equals("Toyota") && price <= 20000 || warranty >= 84) {
			System.out.println("Good Deal");
		}else {
			System.out.println("Don't take the deal");
		}
	}
}
