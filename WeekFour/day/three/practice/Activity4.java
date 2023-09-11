package day.three.practice;

public class Activity4 {
	//create a count down application from 10 to 0; 
	public static void main(String[] args) throws InterruptedException{
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
