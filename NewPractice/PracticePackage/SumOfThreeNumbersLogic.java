package PracticePackage;

public class SumOfThreeNumbersLogic {
	/*
	 * //Give 3 integer values a b c, return their sum. However, if one of the
	 * values is 10 then it does not count towards the sum and values to it's right
	 * do not count. So, for example if b is 10 then both b and c does not count
	 * example: 
	 * freedomSum(1,2,3) ==6 
	 * freedonSum(1,2,10) ==3
	 * freedomSum(1,10,3) == 1
	 */
	public static void main(String[] args) {
	
		System.out.println(sumOfNumbers(1, 2, 3));
		System.out.println(sumOfNumbers(1,2,10));
		System.out.println(sumOfNumbers(1, 10, 3));
		
	

	}

	public static int sumOfNumbers(int a, int b, int c) {

		if (a == 10) {
			return 0;
		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}
	}

}
