package day.three;

public class Activity1 {
	// on main method declare a int number = assign any number. 
	// then check if the number is odd print the number is odd. 
	// otherwise throw RuntimeException with a message. 
	public static void main(String[] args) {
		
		int number = 291819482;
		
		if (number % 2 != 0) {
			System.out.println(number + " is odd");
		}else {
			throw new RuntimeException(number + " is not an odd number");
		}
		
	}
}
