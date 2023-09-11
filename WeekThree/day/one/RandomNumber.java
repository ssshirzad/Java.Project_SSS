package day.one;

public class RandomNumber {
	public static void main(String[] args) {
	// Example:
	// Random number between 0 - 10;
		
	double random = Math.random();
				
	System.out.println("random Value " + random);
	double randomBy10 = random * 10; 
	System.out.println("Randow value multiply by 10 :::: " + randomBy10);
	short castedValue = (short) randomBy10;
				
	System.out.println("Casted number:: " + castedValue);
	}

}
