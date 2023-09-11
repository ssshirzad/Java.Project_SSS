package day.four;

public class GreaterNumberTeacher {
	public static void main(String[] args) {
		
		// write a program that takes two different number
		// and output which one is greater
		
		int number = 200;
		int number2 = 100;
		
		if (number > number2) {
			System.out.println(number);
			
		}else if (number2 > number) {
			System.out.println(number2);
		}else {
			System.out.println("Numbers are equal");
			
			
			// instructor
			
			int firstNumber = 19;
			int secondNumber = 20;
			
			if (firstNumber > secondNumber) {
				System.out.println(firstNumber);	
			}else if (secondNumber > firstNumber) {
				System.out.println(secondNumber);
			}else {
				System.out.println(" Numbers Are Equal");
			}
		}
	}

}
