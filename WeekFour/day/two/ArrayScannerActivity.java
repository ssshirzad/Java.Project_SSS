package day.two;
import java.util.Scanner;
public class ArrayScannerActivity {
public static void main(String[] args) {
	
	int[] userNumber = new int[3];
	Scanner number = new Scanner(System.in);
	System.err.println("Enter first number");
	
	userNumber[0] = number.nextInt();
	System.out.println("Enter second number");
	userNumber[1] = number.nextInt();
	System.out.println("Enter third number");
	userNumber[2] = number.nextInt();
	number.close();
	int result = userNumber[0] + userNumber[1] + userNumber[2];
	
	System.out.println("your result = " + result);
	
}
}
