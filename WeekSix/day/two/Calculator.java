package day.two;

public class Calculator {
	//Instance Variable.
	int first; 
	int second; 
	
	//custom Constructor. (parameterized constructor)
	public Calculator(int firstNumber, int secondNumber){
		first = firstNumber; 
		second = secondNumber; 
	}
	
	public int addNumbers() {
		return first + second; 
	}
}
