package day.two.practice;

public class Activity3 {
	// Activity
		// declare and Assign variable state = "CA"
		// Check state is equal to "Virginia" OR "VA"
		// Print result.
	public static void main(String[] args) {
		
		String state = "CA";
		
		boolean stateCheck = state == "Virginia" || state == "VA";
		System.out.println(stateCheck);
		
		boolean checkState = state.equals("Virginia") || state.equals("VA");
		System.out.println(checkState);
	}
}
