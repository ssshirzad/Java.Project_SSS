package day.three.practice;
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age");
		
		try{int age = scan.nextInt();
		System.out.println("You're "+age+" years old");
		}catch (RuntimeException exception) {
			System.out.println("Enter number for age");
		}finally {
			System.out.println("Finally is being excecuted");
		}
	}

}
