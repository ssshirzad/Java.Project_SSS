package day.three.practice;

public class Activity9 {
	
	public static void main(String[] args) {
		
		int[][] nums = {
				{22, 44, 33},
				{99, 44, 100},
				{55, 33, 13},
		};
		
		int rowLength = nums.length;
		System.out.println("Row Length: "+ rowLength);
		int columnLength = nums[0].length;
		System.out.println("Column Length: "+ columnLength);
		System.out.println("Value on index Row[0] Column[2]: "+ nums[0][2]);
		System.out.println(nums[1][2]);
	}

}
