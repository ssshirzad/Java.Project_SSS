package tek.dragons.week.five.day_three;
//public => access modifier. 
//class => reserved keyword what is the file. file types => class,  interface , enum
//class name is representing what is this class doing. 
public class ClassAndObject {
	// class contains 
	// 1) instance variables. 
	// 2) methods. 
	// 3) constructors. 
	
	// 1) instance variable. 
	// Data type <variable name> = <assignment value>
	String name = "Mohammad";
	int age = 20; 
	
	
	// 2) methods
	//are functions responsible to do a specific task related to the class. 
	//method signatures. 
	//public => access modifier. 
	//void => define the method return type. 
	//void => no return.
	//a method can be static or can be non-static.
	//methodName => a method name can be anything representing what is the method task.
	//() => method parameters. 
	public void methodName() {
		//do your logic coding here
	}
	
	//int => Data type that defines what is the return of this method. 
	// return type can be any of those primitive data type. 
	// return type can be any non-primitive data type. 
	public int returnNumber10() {	
		//all the methods returning should have return keyword with the value. 
		//return keyword should be last line in method block. 
		// any code after return is not reachable and it's a compile error.
		int number = 10; 
		return number;
		//System.out.println(number);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		//local variable to main method. 
//		int age = 20; 
//		
//		if (10 < 20) {
//			//local variable to if block
//			String name = "Mohammad";
//			System.out.println(age);
//		}
//		
//	}
}
