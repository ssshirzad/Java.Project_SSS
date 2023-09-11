package day.three.practice;

public class ArithmeticException {
	public static void main(String[] args) {
		
		int num = 20;
		int num2 = 3;
		
		try{int result = num / num2;
		System.out.println("Result: "+result);
		}catch(RuntimeException exception) {
			System.out.println("Cant divide by zero");
		}finally {
			System.out.println("I shoud've known that");
		}
	}

}
