package day.one;

public class CasitnActivity {
	public static void main(String[] args) {
		// Variable short number = 2000;
		// Variable short number2 = 3000;
		// multiply this two number and 
		// then divide the result by 7;
		
		short number = 2000;
		short number2 = 3000;
		double result = number * number2;
		double result2 = result / 7;
		System.out.println(result2);
		// This is because Java infers the type of int /
		// as int, but the type of double / int is  
		// inferred as double
		int castedResult = (int) result2;
		System.out.println(castedResult);
		
		
	}

}
