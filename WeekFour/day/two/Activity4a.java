package day.two;

public class Activity4a {
	// create an array store 20 int numbers. 
		// and print the last one only. 
		public static void main(String[] args) {
			int[] numbers = new int[23];
	        numbers[0] = 1;
	        numbers[1] = 2;
	        numbers[2] = 3;
	        numbers[3] = 4;
	        numbers[4] = 5;
	        numbers[5] = 6;
	        numbers[6] = 7;
	        numbers[7] = 8;
	        numbers[8] = 9;
	        numbers[9] = 10;
	        numbers[10] = 11;
	        numbers[11] = 12;
	        numbers[12] = 13;
	        numbers[13] = 14;
	        numbers[14] = 15;
	        numbers[15] = 16;
	        numbers[16] = 17;
	        numbers[17] = 18;
	        numbers[18] = 19;
	        numbers[19] = 20; 
	        numbers[20] = 25; 
	        numbers[21] = 30; 
	        numbers[22] = 300;
	        
	       int lastIndex = numbers.length -1;
	       System.out.println(numbers[lastIndex]);
	      
		}
}
