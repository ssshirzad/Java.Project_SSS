package tek.dragons.week.four.day_two;

public class Recap {
	public static void main(String[] args) {
		// creating an array with length of 5 and add some values.
		int[] numbers = new int[5];
		// assign values
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;
		numbers[4] = 500;

		// index out of bound exception (Exception mean a run time failure)
		// numbers[5] = 600;

		// how to get values from array. -> using the index number.
		int number = numbers[2];
		System.out.println(number);

		// how to find the length of the array.
		System.out.println(numbers.length);

		// 2D array -> rows and columns.
		int[][] excelSheet = new int[2][3];
		// assign values;
		excelSheet[0][0] = 10;
		excelSheet[0][1] = 30;
		excelSheet[0][2] = 55;

		excelSheet[1][0] = 90;
		excelSheet[1][1] = 100;
		excelSheet[1][2] = 150;

		System.out.println(excelSheet[0][1]);

		System.out.println("Row lenght " + excelSheet.length);
		System.out.println("Column Lenght " + excelSheet[0].length);

		// another way of declaring arrays.
		String[] cities = { "Alexandria", "Falls Church", "Sterling" };
		System.out.println(cities.length);
		System.out.println(cities[0]);
	}
}
