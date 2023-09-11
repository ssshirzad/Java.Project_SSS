package day.three;

public class ArithmeticOperators {
	
	public static void main(String[] args)	{
		// Arithmetic Operators. + - * / %
		
		// 125, 456 add them together
		
		int result = 125 + 456;
		
		System.out.println(result);
		
		int number1 = 123;
		int number2 = 456;
		
		int result1 = number1 + number2;
		
		System.out.println(result1);
		
		double number3 = 10.25;
		double number4 = 32.12;
		
		double result2 = number3 + number4; // can't be lint because the result is too big
		
		double total = result + result1 + result2;
		
		System.out.println(total);
	}

}
