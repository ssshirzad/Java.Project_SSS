package review;

public class ArithmeticActivity {
	
	// Create new class
	// Create main method
	// 5'6" how tall I'm in CM
	
	public static void main(String[] args) {
		double heightInInch = 5.6;
		double heightInCM = 5.6 * 30.48;
		double height = 5.6 * 30.48;
		System.out.println(height);
		
		// instructor 
		
		int heightFoot = 5;
		int heightInch = 6;
		
		// 1 foot = 12 inch
		// 1 inch = 2.54
		int heightt = heightFoot * 12 + heightInch;
		double heigthCM = heightt * 2.54;
		System.out.println(heigthCM);
		
		// 1 foot = 30.48 CM
		// 1 inch = 2.54 CM
		double footToCM = heightFoot * 30.48;
		double inchToCM = heightInch * 2.54;
		double result = footToCM + inchToCM;
		System.out.println(result);
		
	}

}
