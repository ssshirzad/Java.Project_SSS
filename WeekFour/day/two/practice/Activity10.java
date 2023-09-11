package day.two.practice;

public class Activity10 {
	
	public static void main(String[] args) {
		
		double[] nums = {20.22, 55.22, 77.23, 99.99};
		
		System.out.println("Value on index 3: "+ nums[3]);
		
		double sum = 0;
		int newSum = 0;
		for(int i = 0; i< nums.length; i++) {
			sum += nums[i];	
			newSum = (int) sum;	
		}
		System.out.println("Sum: "+sum);
		System.out.println("Casted Sum: "+ newSum);
	
	}

}
