package tek.dragons.week.three.day_two;

public class Activity1 {
	// Activity
	// declare variable and assign value 24.54; first
	// declare variable and assign value 5; second.
	// check and print first is greater than second 
	// check and print first is less than second 
	// check and print first is greater/Equal than second 
	// check and print first is less/Equal than second 
	// check and print first is equal second 
	// check and print first is not equal than second 
	public static void main(String[] args) {
		double first = 24.54;
		int second = 5; 
		boolean isLessThan = first < second; 
		boolean isGreaterThan = first > second; 
		boolean isLessThanEqual = first <= second;
		boolean isGreaterThanEqual = first >= second; 
		boolean isEqual = first == second; 
		boolean isNotEqual = first != second; 
		
		System.out.println("Less than " + isLessThan);
		System.out.println("Greater than " + isGreaterThan);
		System.out.println("Less than Equal " + isLessThanEqual);
		System.out.println("Greater than Equal " + isGreaterThanEqual);
		System.out.println("Equality " + isEqual);
		System.out.println("Not Equal " + isNotEqual);

	}
}
