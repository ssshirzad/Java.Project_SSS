package tek.dragons.week.one.day.four;

public class ActivityArithmetic {
	// Create new Class. 
	// Create Main method. 
	// I am 5' 6" how tall I'm in CM.
	public static void main(String[] args) {
		int heightFoot = 5; 
		int heightInch = 6; 
		
		//1 foot = 12 inch 
		// 1 inch = 2.54 CM. 
		int heigth = heightFoot * 12 + heightInch;
		double heigthCM = heigth * 2.54; 
		System.out.println(heigthCM);
		
		// 1 foot = 30.48 CM
		// 1 inch = 2.54 CM; 
		double footTocm = heightFoot * 30.48; 
		double inchToCM = heightInch * 2.54;
		double result = footTocm + inchToCM; 
		System.out.println(result);
	}
}
