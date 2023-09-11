package day.two;

public class StackCall {
	public static void main(String[] args) {
		int a = 10; 
		int b = 20; 
		
		StackCall.addNumber(a, b);
		StackCall.printMessage("Testig");
	}
	
	public static void addNumber(int a , int b) {
		int c = a + b; 
		StackCall.printMessage("Result " + c);
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}

}
