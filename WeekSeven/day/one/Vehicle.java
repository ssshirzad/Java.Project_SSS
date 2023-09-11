package day.one;

public class Vehicle {
public String make; 
	
	public Vehicle(String make) {
		this.make = make; 
	}
	
	public void printMake() {
		System.out.println(this.make);
	}
	
	public void startVehicle() {
		System.out.println("The Vehicle is running");
	}
	
}

