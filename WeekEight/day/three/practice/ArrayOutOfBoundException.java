package day.three.practice;

public class ArrayOutOfBoundException {
	public static void main(String[] args) {
		
		int[] digits = {11,22,33,44,55,66};
		
		try{
			System.out.println(digits[5]);
		}catch (ArrayIndexOutOfBoundsException exception) {
			
		}finally {
			System.out.println("Finally will excedute even after the return statement");
		}
	}
}
		
	


