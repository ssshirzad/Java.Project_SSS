package JavaPrograms;

import java.util.Scanner;

public class ConvertingFranhiteToCelcius {
	public static void main(String[] args) {
		float temperatue;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperatue in Fahrenheit");
		temperatue = in.nextInt();
		temperatue = ((temperatue - 32)*5)/9;
		System.out.println("Temperatue in Celsius = " + temperatue);
		in.close();
		}

}
