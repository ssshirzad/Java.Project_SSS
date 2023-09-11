package day.one;

public class TypeCasing {
	public static void main(String[] args) {
		
		// Promotion
		// Automatic type casing is called promotion
		// Example: double value = 2;
		// Example2: int number = 38;
		
		// Type Casting
		// Remove decimal point for double value
		// and store in "int"
		double example1 = 2.90;
		// Casing bellow
		int result = (int) 2.90;
		// When it prints, it only prints 2 and removes 90
		System.out.println(result);
		int result2 = result * 10;
		System.out.println(result2);
		
		
		
		
		
		
	}

}
