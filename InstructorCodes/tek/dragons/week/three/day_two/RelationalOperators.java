package tek.dragons.week.three.day_two;

public class RelationalOperators {
	// this Relational Operators 
	// for can be used for primitive data types. 
	// > greater than, // boolean
	// < less than, // boolean
	// >= greater than equal. // boolean
	// <= less than equal. //boolean
	// == equality. //boolean
	// != not equal. // boolean
	public static void main(String[] args) {
		boolean tenLessThanTwenty = 10 < 20; //true 
		
		System.out.println(tenLessThanTwenty);
		
		int number1 = 100; 
		int number2 = 200; 
		boolean result = number1 > number2; //false
		
		double number3 = 100; 
		double number4 = 100; 
		
		boolean checking = number3 <= number4; //true
		
		boolean checking2 = number3 >= number4; //true
		
		boolean equality = number1 == number2; //false
		
		boolean notEqual = number1 != number2; //true
	}
}
