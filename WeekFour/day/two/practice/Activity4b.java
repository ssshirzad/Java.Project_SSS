package day.two.practice;

public class Activity4b {
	// create an array store 5 int numbers. 
	// and print the last one only. 
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		numbers[0] = 23;
		numbers[1] = 33;
		numbers[2] = 44;
		numbers[3] = 55;
		numbers[4] = 66;
		
		
//		System.out.println(numbers[3]);
		
		int lastIndex = numbers.length - 1;
		
		System.out.println("Printing last index "+ numbers[lastIndex]);
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			System.out.println("Printline inside the loop " + sum);
		}
		System.out.println();
		
		System.out.println("Printline outside the loop bracket "+sum);
		
	}

}
