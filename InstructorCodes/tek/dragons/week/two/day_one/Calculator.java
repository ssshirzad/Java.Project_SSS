package tek.dragons.week.two.day_one;

public class Calculator {
	//Methods in Java. 
	//public: access modifier -> publicly accessible.
	// void: there is no return for this method. 
	public void addTwoNumber() {
		int number = 10; 
		int numberB = 20;
		int result = number + numberB; 
		System.out.println(result);
	}
	
	//Variables in parantesise are called Parameter. 
	public void multiplyTwoNumber(int numberA, int numberB) {
		int result = numberA * numberB; 
		System.out.println(result);
	}
	
	//this method after doint subtraction will return the result. 
	// as int
	public int subtractTwoNumber(int numberA, int numberB) {
		int result = numberA - numberB; 
		return result;
	}
}
