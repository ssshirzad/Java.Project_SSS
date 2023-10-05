package PracticePackage;

public class SwappingNum {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		
		System.out.println("Before Swapping \nx = "+x+"\ny = "+y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swap: \nx = "+x+"\ny = "+y);
		
	}

}
