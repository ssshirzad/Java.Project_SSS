package day.one.practice;
import java.util.Scanner;
public class Activity4 {
	public static void main(String[] args) {
		
		// ask user to choose a password.
		// if the length of password is less than 8
		// print choose stronger password.
		// otherwise print password is strong.
		// ctrl + shift + F ,, command + shift + F
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter A Password");
		
		String password = scan.next();
		
		if (password.length() < 8) {
			System.out.println("Chose Stronger Password");
		}else {
			System.out.println("Password is Good");
			scan.close();
		}
		
	}

}
