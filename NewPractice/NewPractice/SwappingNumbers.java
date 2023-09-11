package NewPractice;

public class SwappingNumbers {

	public static void main(String[] args) {
		int x = 8;
		int y = 6;
		
		System.out.println("Before Swapping \nx = "+x+" \ny = "+y );
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping \nx = "+x+" \ny = "+y );
	}

}
