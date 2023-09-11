package day.two.practice;

public class Bike {
	
	String brand;
	String model;
	int gear;
	double price;
	
	public Bike(String brand, String model, int gear, double price) {
		this.brand = brand;
		this.model = model;
		this.gear = gear;
		this.price = price;
	}
	
	public void printBikeInfo() {
		System.out.println(brand+' '+model+' '+gear+' '+price);
	}
	
	public double sellBike(double price) {
		return price;
	}
	
	public int upShift(int upshift) {
		return upshift;
	}
	
	public int downShift(int downshift) {
		return downshift;
	}
	
	public void brake() {
		System.out.println("Bike is braking");
	}
	
	

}
