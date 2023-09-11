package day.two.practice;

public class Cal {
	
	int first;
	int second;
	
	public int doAddition(int first, int second) {
		int result = first + second;
		System.out.println(first + " + "+ second +" = " + result);
		return result;
	}
	
	public int doMultiply(int first, int second) {
		int result = first * second;
		System.out.println(first + " * "+ second +" = " + result);
		return result;
	}
	
	public double doDividing(int first, int second) {
		double result = first / second;
		System.out.println(first + " / "+ second +" = " + result);
		return result;
	}
	
	public int doSubtraction(int first, int second) {
		int result = first - second;
		System.out.println(first + " - "+ second +" = " + result);
		return result;
	}
	public boolean isEven(int number) {
		if(number % 2 == 0) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean isOdd(int number) {
		if(number % 2 == 1) {
			return true;
		}else {
			return false;
		}		
	}
	
	public void printSpace() {
		System.out.println("------------------------");
	}

}
