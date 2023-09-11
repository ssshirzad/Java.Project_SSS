package day.one.practice;

public class NumbersPractice {

	
	public static void main(String[] args) {
		
		//multiplication by itself
		int number = 2;
		
		number *= number;
		System.out.println(number);
		
		number*=number;
		System.out.println(number);
		
		int result = (3+3) * 4 / 2;
		System.out.println(result);
		
		double random = Math.random();
		
		double num = random * 20;
		int castedNum = (int) num;
		System.out.println(castedNum);
		
		double value = 20.33;
		
		int valueCasted = (int)  value;
		System.out.println(valueCasted);
		
		
	}
}
