package day.two;

public class TwoDimensionArrayActivity {
	public static void main(String[] args) {
		
		
		int[][] table = new int[2][4];
		
		table[0][0] = 5;
		table[0][1] = 10;
		table[0][2] = 15;
		table[0][3] = 20;
		
		table[1][0] = 25;
		table[1][1] = 30;
		table[1][2] = 35;
		table[1][3] = 40;
		
		int lenghtOfRow = table.length;
		int lenghtOfColumn = table[0].length;
		System.out.println("Row Lenght: " + lenghtOfRow);
		System.out.println("Column Lenght: " + lenghtOfColumn);
	}

}
