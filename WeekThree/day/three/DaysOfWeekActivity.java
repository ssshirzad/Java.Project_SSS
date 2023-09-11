package day.three;

public class DaysOfWeekActivity {
	//How to format my code to be pretty ? ctrl + shift + F
	
	//Declare and assign variable dayOfWeek = 3; 
	//if dayOfWeek is == 1 print Sunday 
	//if dayOfWeek is == 2 print Monday 
	//if dayOfWeek is == 3 print Tuesday 
	//if dayOfWeek is == 4 print Wednesday 
	//if dayOfWeek is == 5 print Thursday 
	//if dayOfWeek is == 6 print Friday 
	//if dayOfWeek is == 7 print Saturday 
	// otherwise print wrong entry.
	public static void main(String[] args) {
		int dayOfWeek = 1;
		if (dayOfWeek == 1) {
			System.out.println("It's Sunday");
		}else if (dayOfWeek == 2) {
			System.out.println("It's Monday");
		}else if (dayOfWeek == 3) {
			System.out.println("It's Tuesday");
		}else if (dayOfWeek == 4) {
			System.out.println("It's Wendsday");
		}else if (dayOfWeek == 5) {
			System.out.println("It's Thursday");
		}else if (dayOfWeek == 6) {
			System.out.println("It's Funday");
		}else if (dayOfWeek == 7) {
			System.out.println("It's Saturday");
		}else {
			System.out.println("Wrong Entry");
		}
	}

}
