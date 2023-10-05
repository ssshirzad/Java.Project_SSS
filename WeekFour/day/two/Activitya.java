package day.two;

public class Activitya {
	//Create array that store 4 double values. 
	// assign any values to them 
	// and then find the total of all values. 
	public static void main(String[] args) {
		double[] numbers = new double[4];
		// assigning 
		numbers[0] = 10.21; 
		numbers[1] = 100.32; 
		numbers[2] = 63.45;
		numbers[3] = 76.45;
		
		// sum all the number. 
		double total = numbers[0] + numbers[1] + numbers[2] + numbers[3];
		
		System.out.println("Total is " + total);
	}
}
