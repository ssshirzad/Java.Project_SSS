package day.two;

import java.util.HashSet;

public class Activity4 {

	// Create a Program that make 10 Unique random Numbers between 1 - 57;
	// How to make sure 0 is not included?
	public static void main(String[] args) {

		HashSet<Integer> randomNumbers = new HashSet<>();
		int retryCounter = 0;
		while (randomNumbers.size() < 10) {
			retryCounter++;
			int random = (int) (Math.random() * 100);
			if (random != 0) {
				randomNumbers.add(random);
			}
		}

		for (int random : randomNumbers) {
			System.out.println(random);
		}

		System.out.println("Retry Count : " + retryCounter);
	}
}
