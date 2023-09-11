package tek.dragons.week.eight.day_one;

public abstract class Vehicle {
	public String model; 
	
	public Vehicle(String model) {
		this.model = model; 
	}
	
	public void printModel() {
		System.out.println("Vehicle Model " + model);
	}
	
	//Abstract class can have abstract methods? 
	//abstract method can not have method body. 
	//we have to use abstract keyword in method signature. 
	//all the sub-classes is forced to implement the abstract method implementation. 
	public abstract void running();
	
	public abstract void keylessStart(boolean isKeyless);
}
