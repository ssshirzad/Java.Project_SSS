package day.four;

public class Activity3 {
	//Write a program to print 5 Lottery number between 0 - 57;
	//hint -> you need random numbers. 
	//hint -> output example: 12 23 34 47 55
	//15 Minute time limit. 
	public static void main(String[] args) {	
		for (int i = 0 ; i < 5 ; i++) {
			// create random number. 
			int random = (int) (Math.random() * 57);
			System.out.print(random + " ");
		}
	}

}
