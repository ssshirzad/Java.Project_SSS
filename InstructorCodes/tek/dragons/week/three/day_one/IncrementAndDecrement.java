package tek.dragons.week.three.day_one;

public class IncrementAndDecrement {
	// Increment => increase adding by 1 
	// decrement => decrease subtracting by 1
	public static void main(String[] args) {
		int number = 10; 
		// increment number by 1; 
		number = number + 1; 
		System.out.println(number);
		number += 1; 
		System.out.println(number);
		number ++;
		System.out.println(number);
		
		// decrement number by 1; 
		number = number -1 ; 
		System.out.println(number);
		number -= 1; 
		System.out.println(number);
		number --;
		System.out.println(number);
	}

}
