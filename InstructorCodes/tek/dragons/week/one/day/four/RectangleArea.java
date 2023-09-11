package tek.dragons.week.one.day.four;

public class RectangleArea {
	//Write a application to find the area of 
	// rectangle with length 4" width 12" in CM. 
	
	// area = length * width. 
	
	public static void main(String[] args) {
		int length = 4; 
		int width = 12; 
		
		double lengthInCM = length * 2.54; 
		double widthInCM = width * 2.54; 
		
		//Area of Rectangle. 
		double areaInch = lengthInCM * widthInCM; 

		System.out.println(areaInch);
		
	}
}
