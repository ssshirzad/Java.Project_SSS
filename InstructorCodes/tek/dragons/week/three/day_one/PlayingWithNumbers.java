package tek.dragons.week.three.day_one;

public class PlayingWithNumbers {
	public static void main(String[] args) {
		
		// precedence
		int result = (1 + 2) * 4; 
		System.out.println("Result " + result);
		
		System.out.println("Some Number " + (2 + 2));
		
		//mix type. 
		double number = 10.20; 
		int number1 = 20; 
		double result1 = number + number1; 
		
		//mixed type
		//max value of byte and max value for short 
		//can not be store in short. 
		byte number3 = 127; 
		short number4 = 32767;
		int result2 = number3 + number4; 
		
		//max value of short and max value for int 
		//can not be store in short. 
		short value = 2000; 
		int value2   = 4000; 
		long result4 = value + value2;
	}
}
