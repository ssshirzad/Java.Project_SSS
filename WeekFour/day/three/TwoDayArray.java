package day.three;

public class TwoDayArray {
	public static void main(String[] args) {
		 int[][] numbers = {
				    {10, 20, 30},
				    {40, 50, 60},
				  };
		 
		 for(int i = 0; i < numbers.length; i++) {
			 for(int j = 0; j < numbers[i].length; j++) {
				 System.out.print(numbers[i][j]+ " "); 
			 }
			System.out.println(); 
		 }
		 System.out.println("------------------------------");
		 for(int i = numbers.length; i > 0; i++) {
			 for(int j = numbers[i].length; i > 0; i++) {
				 System.out.println(numbers[j][i]);
			 }
			 System.out.println();
		 }
	}

}
