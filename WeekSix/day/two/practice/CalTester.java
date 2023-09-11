package day.two.practice;

public class CalTester {
	
	public static void main(String[] args) {
		
		Cal cal = new Cal();
	
		int addition = cal.doAddition(2, 2);
		System.out.println(addition);
		
		cal.printSpace();
		
		int multiplicaiton = cal.doMultiply(10, 3);
		System.out.println(multiplicaiton);
		
		cal.printSpace();
		
		int division = (int) cal.doDividing(100, 10);
		System.out.println(division);
		
		cal.printSpace();
		
	System.out.println(cal.doSubtraction(12, 10));
		
		cal.printSpace();
		
		boolean isEven = cal.isEven(11);
		System.out.println(isEven);
		
		cal.printSpace();
		
		boolean isOdd = cal.isOdd(11);
		System.out.println(isOdd);
		
	}

}
