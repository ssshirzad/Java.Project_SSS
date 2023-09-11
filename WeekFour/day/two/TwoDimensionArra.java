package day.two;

public class TwoDimensionArra {
	public static void main(String[] args) {
		// Create a 2D array 2 row and 3 column
		//new int[2][3] first one is row second one is column
		int[][] numbers = new int[2][3];		
		//assign values 
		//first row assignment
		numbers[0][0] = 10; 
		numbers[0][1] = 20; 
		numbers[0][2] = 30; 
		//second row assignment
		numbers[1][0] = 40; 
		numbers[1][1] = 50; 
		numbers[1][2] = 60; 
		
		//how to find length of row and length of columns
		int rowLength = numbers.length;
		System.out.println("Row Length " + rowLength);
		//using first row index finding the column length
		int columLength= numbers[0].length;
		System.out.println("Column Length " + columLength);	
		System.out.println(numbers[1][0]);	
		
	}
}
