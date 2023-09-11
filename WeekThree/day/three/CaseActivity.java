package day.three;

public class CaseActivity {
	// Declare and assign variable dayOfWeek = 3;
	// case 1 print Sunday
	// case 2 print Monday
	// case 3 print Tuesday
	// case 4 print Wednesday
	// case 5 print Thursday
	// case 6 print Friday
	// case 7 print Saturday
	// default print wrong entry.
	public static void main(String[] args) {
		int dayOfWeek = 7;
		switch (dayOfWeek) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
	}
}
