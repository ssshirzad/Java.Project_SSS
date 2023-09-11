package tek.dragons.week.seven.day_one;

import tek.dragons.week.eight.day_one.Ford;

public class RunnerClass {



	public static void main(String[] args) {
		
		Ford ford = new Ford(null); 
		//printMake method from Super class Vehicle. 
		Toyota.printMake();	
		
		Toyota toyota = new Toyota(); 
		toyota.printMake();
		
		Benz benz = new Benz(); 
		benz.printMake();
		
		
		
		
		
		
		

//		SubClass subObj = new SubClass();
//
//		subObj.printVariable();

//		SuperClass object = new SuperClass("Some text here");
//		
//		object.printVariable();
	}
}
