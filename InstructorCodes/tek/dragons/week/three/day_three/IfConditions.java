package tek.dragons.week.three.day_three;

public class IfConditions {
	//Selections In Java? 
	// if statements. are block of codes with conditions.  
	// switch statement. are block of code and base on cases. 
	public static void main(String[] args) {
		int age = 16; 
		
		// if age is greater than 18 eligible for drive. 
		// otherwise not eligible. 
		
		// if statements comes with at least one condition
		// else statement do not required condition.
		if (age > 18) {
			// do something. 
			System.out.println("You are eligible to drive.");
		} else {
			System.out.println("Not eligible to drive.");
		}
	}
}
