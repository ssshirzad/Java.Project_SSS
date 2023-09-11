package tek.dragons.week.eight.day_one;

public class Polymorphism {
	//Polymorphism? A method OR Constructor have different forms. 
	
	// 1) Overloading / Compile Time Polymorphism / static polymorphism
	// 2) Overriding  / runtime polymorphism / dynamic polymorphism

	// Overloading: 
	/*
	 * Happening in the same class only. 
	 * applies on methods and constructors. 
	 * overloading means methods / constructors have same name but different parameters. 
	 * How to Apply Overloading? 
	 * 1) we should have methods with same name that doing same task
	 * 2) by changing the parameters DATA TYPE. 
	 * 3) changing the number of parameters. 
	 * 
	 * NOTES: 
	 * - Changing method name is not overloading. 
	 * - Changing parameter name is not effecting overloading. 
	 * - Changing the method return type will not effect overloading. 
	 */
	
	/*
	 * Overriding
	 * its only happening with Inheritance. 
	 * a sub-class method can override super-class method. 
	 * sub-class method should have exactly same method signature of super class method. 
	 * in order to override a super-class method, object instantiation should refer to sub-class. 
	 */
	
	public void doAdding(int first, int second) {
		int result = first + second; 
		System.out.println(result);
	}
	
	public void doAdding(int number1, int number2, int number3) {
		int result = number1 +  number2 + number3;
		System.out.println(result);
	}
	
	public void doAdding(double first , double second) {
		double result = first + second; 
		System.out.println(result);
	}
	
	public void doAdding(String first, String second) {
		//Parse / Convert from String to Double. using Wrapper Classed. 
		double firstParsed = Double.parseDouble(first);
		double secondParsed = Double.parseDouble(second);
		double result = firstParsed + secondParsed;
		System.out.println(result);
	}
 	
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism(); 
		obj.doAdding(10, 20);
		obj.doAdding(10.50, 50.67);
		
		obj.doAdding("90.21", "89.23");
	}
}
