package PracticePackage;

public class NumberCombo {
	/*
	 * //write a function that prints all the 3 digit combination of numbers between
	 * 1 and 5 
	 * 1 , 1, 1 
	 * 1, 1, 2 
	 * 5, 5, 5
	 */

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int counter = 0;

		for (int i = a; i <= b; i++) {
			for (int j = a; j <= b; j++) {
				for (int k = a; k <= b; k++) {
					System.out.println(i + " " + j + " " + k);
					counter++;
				}
			}
		}
		System.out.println(counter);
		printNumbers(1, 5);
	}

	public static void printNumbers(int start, int end) {

		int counter = 0;

		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				for (int k = start; k <= end; k++) {
					System.out.println(i + " " + j + " " + k);
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}
