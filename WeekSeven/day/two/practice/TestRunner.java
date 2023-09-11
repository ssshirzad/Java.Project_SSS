package day.two.practice;

public class TestRunner {
	
	public static void main(String[] args) {
		
		
		Vehicle benz = new Benz("Benz");
		
		benz.printModel();
		benz.driving();
		
		Vehicle honda = new Honda("Honda");
		honda.printModel();
		honda.driving();
		
		System.out.println(honda.isKeyLess(false));
	}

}
