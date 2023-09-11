package day.two;

public class LogicalOperators {
	// &&  AND operator. // all conditions should be true to return true;
	// || OR Operator. // any condition that is true will return true. 
	// ! NOT operator. // NOT will change the condition opposite way. 
	public static void main(String[] args) {
		int age = 65; 
		
		boolean eligibleToWork = age >= 16 && age <= 65;
		
		System.out.println(eligibleToWork);
		
		int number = 0;
		boolean checkingResult = number != 0 || number > 1;
		
		System.out.println(checkingResult);
		
	}
}
