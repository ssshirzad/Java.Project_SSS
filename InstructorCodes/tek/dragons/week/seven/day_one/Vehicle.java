package tek.dragons.week.seven.day_one;

public class Vehicle {
	public String make; 
	
	public Vehicle(String make) {
		this.make = make; 
	}
	
	public static void printMake() {
		System.out.println(this.make);
	}
	
}
