package tek.dragons.week.four.day_three;

public class TwoDimensionArray {
	// another way declaring 2D array.
	public static void main(String[] args) {
		int[][] numbers = { 
				{ 10, 20, 30 }, 
				{ 60, 70, 80 },
				{100, 200, 300}
			};
		System.out.println("Rows lenght " + numbers.length);
		System.out.println("Columns lenght " + numbers[0].length);
		
		System.out.println(numbers[1][2]);
	}
}
