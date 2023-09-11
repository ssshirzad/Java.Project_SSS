package tek.dragons.week.six.review;

public class Activity4 {
	// 1) create a method that can generate random number 
	//between 0 to any number you ask. and return the random integer number. 
	public int makeRandomNumber(int max) {
		Activity2 obj = new Activity2();
		double random = Math.random() * max;
		return obj.toAbsoluteInt(random);
		//return (int) random;
	}
	// 2) create a method that take 1 parameter as length
	// and create and array of int for that length and store random numbers. 
	// return the array
	public int[] createRandomArray(int length) {
		int[] numbers = new int[length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = makeRandomNumber(50);
		}
		return numbers;
	}	
	// 3) create main method and print random numbers in that array. 	
	public static void main(String[] args) {
		Activity4 obj = new Activity4();
		int[] numbers = obj.createRandomArray(15);	
		for (int number : numbers) {
			System.out.println(number);
		}
	} 
}
