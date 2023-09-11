package tek.dragons.week.five.day_one;

public class ForLoopExample {
	// given the int array below.
	// find the sum of values the array.
	public static void main(String[] args) {
		int[] numbers = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		//first solution regular for loop. 
		int sum = 0; 
		for (int i = 0; i < numbers.length ; i++) {
			sum += numbers[i];
		}
		System.out.println("First solution result. " + sum);
		
		//second solution using enhance for loop. 
		
		int total = 0; 
		for (int value : numbers) {
			total += value;
		}
		
		System.out.println("Second solution result " + total);
	}
}
