package day.four.practice;

public class Activity4 {
	
	public static void main(String[] args) throws InterruptedException{
		
		for (int i = 10; i >1; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}
