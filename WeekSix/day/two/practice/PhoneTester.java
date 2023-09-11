package day.two.practice;

public class PhoneTester {

	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		
		myPhone.setMake("iPhone");
		System.out.println(myPhone.getMake());
		
		myPhone.setPrice(1499.99);
		System.out.println(myPhone.getPrice());
		
		myPhone.setRelease(2022);
		System.out.println(myPhone.getRelease());
	}
}
