package day.two;

public class Activity3 {
	// Activity
	// declare and Assign variable state = "CA"
	// Check state is equal to "Virginia" OR "VA"
	// Print result.
	public static void main(String[] args) {
		String state = "CA";
		boolean checkState = state.equals("Virginia") || state.equals("VA");
		
		System.out.println(checkState);
		
		boolean checkState2 = !state.equals("CA");
		System.out.println(checkState2);
		
		boolean checkState3 = state.equalsIgnoreCase("ca");
		System.out.println(checkState3);
		
		String replaceChar = state.replace('C', 'V');
		System.out.println(replaceChar);
	}
}
