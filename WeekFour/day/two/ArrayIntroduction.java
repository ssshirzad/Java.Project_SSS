package day.two;

public class ArrayIntroduction {
	public static void main(String[] args) {
		//have a container for value of the same data type. 
		// we are using array. 
		
		//Arrays always have index. 
		//Arrays always have length
		//arrays can store values of data type only. 
		//arrays a fixed size. 
		
		//Creating arrays
		int[] numbers = new int[5];
		
		//how to assign values to this array. 
		numbers[0] = 10; 
		numbers[1] = 20; 
		numbers[2] = 30; 
		numbers[3] = 40; 
		numbers[4] = 50;
		
		// How to get values from the array. 
		System.out.println(numbers[4]);
		
		// how to get the length the array. 
		int arrayLength = numbers.length;
		System.out.println(arrayLength);
	}
}
