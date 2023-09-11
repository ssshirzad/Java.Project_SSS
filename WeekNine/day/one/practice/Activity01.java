package day.one.practice;
import java.util.ArrayList;
public class Activity01 {
	// Create an Array that storing 5 numbers and try to assign any number
	// and print the numbers 1 by 1;
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(11);
		nums.add(23);
		nums.add(55);
		nums.add(33);
		
		for(int num : nums) {
			System.out.println(num);
		}
	}

}
