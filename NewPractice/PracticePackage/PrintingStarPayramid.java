package PracticePackage;

public class PrintingStarPayramid {

	public static void main(String[] args) {
		String star = "*";
		int rowNumber = 10;
		
		for(int i = 0; i < rowNumber; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(star + ' ');
			}
			System.out.println();
		}

	}

}
