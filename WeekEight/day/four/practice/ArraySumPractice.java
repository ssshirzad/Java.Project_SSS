package day.four.practice;
import java.util.Scanner;
public class ArraySumPractice {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Length");
	int userInput = scan.nextInt();
	int[] number = new int[userInput];
	int total = 0;
	
	for (int i = 0; i < number.length; i++) {
		scan = new Scanner(System.in);
		System.out.println("Enter " + (i+1)+ " number");
		number[i] = scan.nextInt();
	}
	
	for (int num: number) {
		total += num;
	}
	System.out.println("Total of user Input: " + total);
	scan.close();
}
}
