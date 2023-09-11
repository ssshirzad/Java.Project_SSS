package tek.dragons.week.eight.day_three;

public class Exceptions {
	public static void main(String[] args) {
		
		// Compile Error: is kind of error that will happen during the compile time. 
		// you can NOT execute your code that have a compile error. 
		
		//Runtime Exceptions: Happening during the execution of a code
		// that code might crash due to error even by code mistakes or data mistakes. 
		
		//Handle An Exception: try and catch block.
		//try is a block code that will execute. 
		// if try block execute successfully then execution continue
		// if try block catch the exception
		// then catch block will execute. 
		// every try block should have at least one catch block. 
		// a try/catch block can have finally block at the end as optional
		// finally block will execute all the time. 
		
		System.out.println("Code start here");
		try {
			double result = 50 / 0; 
			System.out.println(result);
		}catch(ArithmeticException exception) {
			System.out.println("An Exception Happened due to division by 0");
		}
		
		System.out.println("Code end in here. ");
		
	}
}
