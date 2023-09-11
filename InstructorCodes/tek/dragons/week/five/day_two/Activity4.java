package tek.dragons.week.five.day_two;

public class Activity4 {
	//write a program the print below pattern. 
	// *
	// **
	// ***
	// ****
	// *****
	
	//Hint: nested loop
	//15 minute
	public static void main(String[] args) {		
		for(int row = 1; row <= 10; row++) {
			for(int col = 1 ; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
