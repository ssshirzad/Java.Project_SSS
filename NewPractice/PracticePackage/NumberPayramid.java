package PracticePackage;

public class NumberPayramid {

	public static void main(String[] args) {
		int rows = 5;
		numberPayramid(rows);

	}
	
	public static void numberPayramid(int rows) {
		int counter = 1;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(counter + ' ');
				counter++;
			}
			System.out.println();
		}
	}

}
