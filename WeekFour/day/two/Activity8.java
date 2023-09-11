package day.two;

public class Activity8 {
	//Create an array with 2 row and 4 column. 
	// assign integer values. 
	// and print the length or row and column
	// and print value on 0,2
	public static void main(String[] args) {
		int[][] numbers = new int[2][4];
		//row 1
		numbers[0][0] = 100; 
		numbers[0][1] = 200; 
		numbers[0][2] = 300; 
		numbers[0][3] = 400; 
		//row 2 
		numbers[1][0] = 500; 
		numbers[1][1] = 600; 
		numbers[1][2] = 700; 
		numbers[1][3] = 800; 
		
		int rowLength = numbers.length; 
		int columnLength = numbers[0].length;
		System.out.println("Column Lenght " + columnLength);
		System.out.println("Row Length " + rowLength);
		System.out.println(numbers[0][2]);
		
	}
}
