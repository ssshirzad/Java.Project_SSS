package day.four;

public class Activity3Practice {
public static void main(String[] args) {
	//Write a program to print 5 Lottery number between 0 - 57;
		//hint -> you need random numbers. 
		//hint -> output example: 12 23 34 47 55
		//15 Minute time limit. 
	for (int i = 0; i < 5; i++) {
		int loterryNumber = (int) (Math.random() * 57);
		System.out.print(loterryNumber + " ");
	}
}
}
