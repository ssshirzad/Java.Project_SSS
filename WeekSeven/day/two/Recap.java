package day.two;

public class Recap {
	//a final class can not inherit
	//final variable can be assigned only one time. 
	//instance variable. 
	public final String finalVariable = "This is final variable";
	
	//Constant Variable
	public final static String STATIC_VARIABLE = "This is static variable";
	
	public static void main(String[] args) {
		//local variable and it's local to main method. 
		final String name = "Some name";
	
		final int branchCount = 16; 
		
		System.out.println(Recap.STATIC_VARIABLE);
		//Calling a class and method name
		double random = Math.random();
		Recap.printMessage();
	}
	
	//final method mean avoiding override 
	public final void printSomething() {
		System.out.println("Something");
	}
	
	public static void printMessage() {
		System.out.println("Printing");
	}

}
