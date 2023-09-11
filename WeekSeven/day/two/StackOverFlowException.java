package day.two;

public class StackOverFlowException {
	//StackOverFlowError: Interview Question. 
	//when a method calling itself will cause StackOverFlowError
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		print();
	}
}
