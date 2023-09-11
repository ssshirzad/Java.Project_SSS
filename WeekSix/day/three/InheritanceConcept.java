package day.three;

public class InheritanceConcept {
	/*
	 * 1) Inheritance is a mechanism which sub-class will have access 
	 * to all the variables and methods in super-class.
	 * 2) if a sub-class inherit to super-class then object instantiation from super-class
	 * not required.
	 * 3) sub-class will inherit to super-class using "extends" keyword at class signature
	 * 4) multilevel inheritance is allowed in Java. sub-class -> super-class -> super-super-class
	 * 5) A sub-class can not inherit to multiple super-class at same time.
	 * 6) only public and protected access modifier is visible in sub-class
	 * 7) a sub-class will not have access to another sub-class variables and method
	 * even if the are inherit to same super-class
	 * 
	 */
	
	public static void main(String[] args) {
		AccessModifier obj =  new AccessModifier();
		System.out.println(obj.protectedString);
		System.out.println(obj.publicString);
	
	}

}
