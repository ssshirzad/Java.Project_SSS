package tek.dragons.week.three.day_three;

public class Recap2 {
	public static void main(String[] args) {
		
		//Relational Operators. -> primitive data type. 
		// > greater than 
		// < less than
		// >= greater than equal
		// <= less than equal. 
		// == equality
		// != not Equal
		
		// Logical Operator -> when you have 2 or more conditions.
		// && AND -> all conditions should be true -> return true
		// || OR -> on of the condition if true -> return true
		// ! NOT -> change the condition opposite way. 
		
		int number1 = 100; 
		int number2 = 200; 
		boolean isLessThan = number1 < number2;
		boolean isGreaterThan = number1 > number2;
		boolean isEqual = number1 == number2; 
		
		boolean check = number1 > 0 && number1 < 1000; 
		
		boolean check2 = number2 > 100 || number2 > 200;
	}
}
