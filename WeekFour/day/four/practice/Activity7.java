package day.four.practice;

public class Activity7 {

	public static void main(String[] args) {
		
		int[] numbers = {23,44,53, 32, 23, 97};
		
		for(int nums: numbers) {
			System.out.println(nums+ " ");
			
			System.out.println();
			
			for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
		}
	}
}
