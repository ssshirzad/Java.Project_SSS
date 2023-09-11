package day.one;

public class TestingOverriding {
	public static void main(String[] args) {
		//1) creating object from sub-class referring to sub-class. 
		// no overriding
		Toyota toyotaObject = new Toyota(); 
		toyotaObject.running();
		
		//override: we should create object of super-class referring to sub-class. 
		Vehicle vehicleObj = new Toyota(); 
		vehicleObj.running();
		
		Vehicle vehicleObjFromFrod = new Ford();
		vehicleObjFromFrod.running();
		
		//Creating object of Super-class referring to Sub-class 
		// No Overriding happening. 
		Vehicle vehicle = new Vehicle();
		vehicle.running();
	}

}
