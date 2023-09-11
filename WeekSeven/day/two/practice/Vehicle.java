package day.two.practice;

public abstract class Vehicle {
	
	public String model;
	
	public Vehicle(String model) {
		this.model = model;
	}
	public void running() {
		System.out.println("Vehilc class running");
	}
	public void printModel() {
		System.out.println("Vehilce model: " + model);
	}
	
	public abstract void driving();
	public abstract boolean isKeyLess(boolean isKeyLess);

}
