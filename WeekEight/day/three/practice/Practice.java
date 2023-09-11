package day.three.practice;

public class Practice {
public static void main(String[] args) {
	
	int number = 8;
	
	if (number % 2 !=0) {
		System.out.println(number + " number is Odd");
	}else 
		throw new RuntimeException("Number is Even");
}
}
