package day.one;

public class Calculator {
	// Methods in Java
	// Public: access modifier -> publicly accessible.
	// Public means this calls is available for every one
	
	public void addTwoNumber() {
		int number = 10;
		int numberB = 20;
		int result = number + numberB;
		System.out.println(result);
		
		}
	
		// variables in parantesise are called parameter
		public double multiplyTwoNumber(int numberA, int numberB) {
		int result = numberA * numberB;
		System.out.println(result);
		return result;
			
		}
		// this method after doing subtraction will return the result as int
		public int subtractTwoNumbers(int numberA, int numberB) {
			int result = numberA - numberB;
			System.out.println(result);
			return result;
		
		
		
	}

}
