package day.two;

public class LaptopTester {
	public static void main(String[] args) {
		
		Laptop lenovo = new Laptop();
		
		lenovo.setMake("Lenovo");
		lenovo.setHDR(512);
		lenovo.setPrice(505.15);
		
		System.out.println("Make: " + lenovo.getMake());
		System.out.println("HDR Size: " + lenovo.getHDR());
		System.out.println("Price: $" + lenovo.getPrice());
		
		System.out.println("-------------------");
		
		Laptop dell = new Laptop("Dell", 128, 129.99);
		System.out.println("Make: " +dell.getMake());
		System.out.println("HDR Size: "+ dell.getHDR());
		System.out.println("Price: $" +dell.getPrice());
	}

}
