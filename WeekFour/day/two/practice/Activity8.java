package day.two.practice;

public class Activity8 {
	//Create an array with 2 row and 4 column. 
	// assign integer values. 
	// and print the length of row and column
	// and print value on 0,2
	public static void main(String[] args) {
		
		int[][] nums = new int[2][4];
		
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
		nums[0][3] = 40;
		
		nums[1][0] = 50;
		nums[1][1] = 60;
		nums[1][2] = 70;
		nums[1][3] = 80;
		
		int rowLength = nums.length;
		int columsLength = nums[0].length;
		System.out.println("Row Length: " + rowLength);
		System.out.println("Colums Length: "+ columsLength);
		System.out.println("Value on Row[0], Column[2] : "+ nums[0][2]);
		
	
			
			
			
		
		
		
		
	}

}
