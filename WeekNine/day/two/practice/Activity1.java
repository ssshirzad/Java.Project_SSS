package day.two.practice;

import java.util.HashSet;

public class Activity1 {
	public static void main(String[] args) {
		
		HashSet<Integer> nums = new HashSet<>();
		
		nums.add(11);
		nums.add(22);
		nums.add(33);
		nums.add(44);
		nums.add(44); // ignored, no duplicate
		
		int hashSize = nums.size();
		System.out.println("Size of HashSet = "+hashSize);
		
		int sum = 0;
		
		for (int num : nums) {
			sum+=num;
		}
		System.out.println("Sum of HashSet = "+ sum);
	}

}
