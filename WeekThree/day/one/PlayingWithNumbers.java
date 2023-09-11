package day.one;

public class PlayingWithNumbers {
	
	public static void main(String[] args) {
		int result = 1+2*4; // this don't = 12 but 9
		// In Java division is first executed
		System.out.println(result);
		
		// if we want raise the prcidence, we put them
		// parantasis 
		
		int result2 = (1+2)*4; // now the result will be 12
		System.out.println(result2);
		
		System.out.println("Number:" + 2 +2); // number: 22
		System.out.println("Number:" + (2+2)); // number: 4
		
		double number = 10.20;
		int number1 = 20; 
		// if one value is double it's always a double
		double result3 = number * number1;
		System.out.println(result3);
		
		// Mixed Type
		// Max value of byte and max value for short
		// can not be stored in short
		// have to go up 
		byte number2 = 20;
		short number3 = 32123;
		int result4 = number2 + number3;
		System.out.println(result4);
		
		short value = 2000;
		int value2 = 4000;
		int result5 = value + value2;
		System.out.println(result5);
		
		
		
		
	}

}
