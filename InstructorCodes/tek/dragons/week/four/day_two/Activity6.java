package tek.dragons.week.four.day_two;

public class Activity6 {
	public static void main(String[] args) {
		double[] numbers = {10.21, 13.41, 15.32, 65.12 , 15.24 , 26.35, 98.35};
		//find the sum of all the number in this array. 
		double sum = 0; 
		// index are incrementing 
		// always start from 0; 
		// end on last index --> length - 1 ; 
		
		for(int index = 0; index < numbers.length; index++) {
			sum += numbers[index];
		}
		
		System.out.println("Total sum is " + sum);
	}
	
	
	//double sum = numbers[0] + numbers[1] + numbers[2] + numbers[3];	
//		sum += numbers[0];
//		sum += numbers[1];
//		sum += numbers[2];
//		sum += numbers[3];
//		sum += numbers[4];
}
