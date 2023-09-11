package JavaPrograms;

import java.util.Scanner;

public class StringComaprePractice2 {

	public static void main(String[] args) {
		String str1, str2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first String");
		str1 = scanner.nextLine();
		System.out.println("Please enter second String");
		str2 = scanner.nextLine();
		
		int str1Length = str1.length();
		int str2Length = str2.length();
		
		if(str1.compareTo(str2) < 0) {
			System.out.println("String one is greater");
		}else if(str2.compareTo(str1) < 0) {
			System.out.println("String two is greater");
		}
		System.out.println("Str1 length "+str1Length);
		System.out.println("Str2 Length "+str2Length);
		scanner.close();

	}

}
