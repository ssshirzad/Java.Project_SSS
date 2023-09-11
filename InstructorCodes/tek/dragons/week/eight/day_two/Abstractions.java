package tek.dragons.week.eight.day_two;

public class Abstractions {
	// Abstraction? 
	// A mechanism to restrict creating object from a class. 
	// Abstractions is only use in Inheritance.
	// 1) Abstract classes -> (Partial Abstraction)
	// - to make a class abstract we have to use abstract keyword in class signature. 
	// - an abstract class can have regular variable and methods.
	// - in abstract class we can have abstract methods. 
	// 2) interfaces -> (Fully Abstraction)
	// - similar to class but fully abstract. 
	// - methods are abstract by default (no need to use abstract keyword). 
	// - We can NOT create object from an interfaces. 
	// - a class can use interface by using implements keyword. 
	// - only constant variables allowed. 
	// - any class that implements to interface have provide their logic for all the methods
	// in interface. 

	
	/*
	 * Difference between Abstract Class and Interface? 
	 * 1) abstract class is partial abstraction vs interface is fully abstract 
	 * 2) abstract class only us in inheritance with extends keywords. interface 
	 * should use with implements keyword. 
	 * 3) abstract class can have regular methods and abstract methods.
	 *  interface only method signature. 
	 * 4) only constants variable in interface.
	 * 5) a sub-class can extends to only 1 abstract super-class. but a class can implements
	 * to multiple interface. 
	 * 6) a sub-class can inherit to abstract/non-abstract class and 
	 * at the same time implements interfaces.  
	 */
}
