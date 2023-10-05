package PracticePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindValuesInArray {
	public static void main(String[] args) {

		// finding largest
		int[] nums = { 4, 2, 6, 10, 12, 99 };
		int largest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
			}
		}
		System.out.println("Largest value = " + largest);

		// smallest value
		int smallest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (smallest > nums[i]) {
				smallest = nums[i];
			}
		}
		System.out.println("Smallest value = " + smallest);

		// second largest
		int secondLargest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > secondLargest && nums[i] < largest) {
				secondLargest = nums[i];

			}
		}
		System.out.println("Second Largest = " + secondLargest);

		// Finding sum of all values

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("Sum of all values = " + sum);

		// Finding average of all values
		Double average = 0.0;
		average = (double) (sum / nums.length);

		System.out.println("Average of all values = " + average);
	}
	
	public static int findLargestValueWithPossition(int[] nums, int possition) {
		Set<Integer> numberSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numberSet.add(nums[i]);
		}

		List<Integer> numberList = new ArrayList<Integer>(numberSet);
		Collections.sort(numberList);
		possition -=1;
		if(possition > numberList.size() || possition < 0) {
			System.out.println("invalid position");
		}else {
			return -1;
		}
		return numberList.get(possition - 1);
	}

	public static int findSecondSmallestValue(int[] nums) {
		int secondSmallest = nums[0];
		int smallest = findSmallestValue(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > smallest && nums[i] < secondSmallest) {
				secondSmallest = nums[i];
			}
		}
		return secondSmallest;
	}

	public static int findSecondLargestValue(int[] nums) {
		int secondLargest = nums[0];
		int largest = findLargestValue(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > secondLargest && nums[i] < largest) {
				secondLargest = nums[i];
			}
		}
		return secondLargest;
	}

	public static int findLargestValue(int[] nums) {
		int largest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
			}
		}
		return largest;
	}

	public static int findSmallestValue(int[] nums) {
		int smallest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		return smallest;
	}

	public static int getSumOfValue(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public static double getAverageOfValue(int[] nums) {
		return (double) getSumOfValue(nums) / nums.length;
	}

}
