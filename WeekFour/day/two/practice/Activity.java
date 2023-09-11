package day.two.practice;

public class Activity {
	//Create array that store 4 double values. 
	// assign any values to them 
	// and then find the total of all values. 
	
	public static void main(String[] args) {
		
		double[] numberArray = new double[4];
		
		numberArray[0] = 10;
		numberArray[1] = 20;
		numberArray[2] = 30;
		numberArray[3] = 40;
		
		double total = 0;
		total+= numberArray[0];
		total+= numberArray[1];
		total+= numberArray[2];
		total+= numberArray[3];
		
		System.out.println(total);
		
		double total2 = numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3];
		System.out.println(total2);
		
		for (int i = 0; i < numberArray.length; i++) {
			total += numberArray[i];
			
		}
		System.out.println(total); 
		
		int sum = 0;
		int[] digits = {20, 30, 40, 50};
		
		for (int counter = 0; counter < digits.length; counter ++) {
			sum *= digits[counter];				
		}
		System.out.println(sum);
		
	}

}

