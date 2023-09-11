package day.three.practice;

public class ExceptionMessage {
	public static void main(String[] args) {
		
		System.out.println("Code beginning....");
		
		try {
			int number = 20 / 0;
			System.out.println(number);
		
	}catch (ArithmeticException exception) {
		System.out.println("Error: can not devide by zero");
	}
System.out.println("Code ending!!!!");
}
}
