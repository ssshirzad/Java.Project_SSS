package day.one;

public class MultipilicationByItself {
	public static void main(String[] args) {
		// declare variable int 2 and multiply by itself 3 times
		
		int number = 2;
		// int result = number * number * number;
		// System.out.println(result);
		
		// Declare and assign for initial point
		
		int result = 1;
//		number *= number;
//		System.out.println(number);
		// 2 = 1 * 2
		// result = result * number;
		result *= number; // 2
		
		// 4 = 2 * 2
		// result + result * number
		result *= number; // 4
		
		
		// 8 = 4 * 2
		// result + result * number
		result *= number;
		System.out.println(result);
		
	}

}
