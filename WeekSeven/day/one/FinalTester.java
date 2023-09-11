package day.one;

public class FinalTester {
	
	public static void main(String[] args) {
		
		FinalKeyword a = new FinalKeyword();
		
		System.out.println(a.name);
		
		Vehicle car = new Vehicle("Mazda");
		car.printMake();
		car.startVehicle();
	}

}
