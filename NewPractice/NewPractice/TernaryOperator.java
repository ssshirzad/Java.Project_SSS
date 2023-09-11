package NewPractice;

public class TernaryOperator {

	public static void main(String[] args) {
		// variable = (condition) ? TrueExpression : FalseExpression
		
		int num1 = 20;
		int num2 = 40;
		
		if(num1>num2) {
			System.out.println("num1 > num2");
		}else {
			System.out.println("num1 < num2");
		}
		
		String result = (num1>num2) ? "num1 > num2" : "num1 < num2";
		System.out.println(result);

	}

}
