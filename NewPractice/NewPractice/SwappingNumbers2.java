package NewPractice;

public class SwappingNumbers2 {

	public static void main(String[] args) {
		int x = 4;
		int y = 6;
		int num;
		
		System.out.println("Before Swapping\nx = "+ x + "\ny = "+y);
		
		num = x;
		x = y;
		y = num;
		
		System.out.println("After Swapping\nx = "+ x + "\ny = "+y);

	}

}
