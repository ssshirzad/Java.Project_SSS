package day.four;

public class RemainderOutPutMine {
	public static void main(String[] args) {
		
		int number = 2;
		
		if (number % 2 == 0) {
			System.out.println("number " + number + " is even");
		}else {
			System.out.println("number " + number + " odd");
			
			// Instructor
			// if remainder of a number / 2 = 0 is even. otherwise this odd
			int value = 1922;
			if (value % 2 == 0) {
				System.out.println(value + " is even");
			}else {
				System.out.println(value + " is odd");
			}
		}
	}

}
