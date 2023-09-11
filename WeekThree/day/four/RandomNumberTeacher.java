package day.four;

public class RandomNumberTeacher {
	//Write a program that generate a random number 
		// between 0 - 500 and if the random number is odd convert it to negative number,
		// and print the output. 
		public static void main(String[] args) {
			//generate a random number. 
			// Math.random() returning double value between 0 - 1;
			//Casting double value to int
			int random = (int) (Math.random() * 500);  
			
			if (random % 2 == 1) {
				int negative = random * -1;
				System.out.println("Random is Odd converted to negative " + negative);
			} else {
				System.out.println("random is even " + random);
			}
		}
}
