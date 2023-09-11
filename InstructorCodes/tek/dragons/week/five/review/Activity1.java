package tek.dragons.week.five.review;

public class Activity1 {
	// Create a program the will do a count down and pause every 1 second.
	// 5 Minute
	public static void main(String[] args) throws InterruptedException {
//		for (int start = 10 ; start >= 0 ; start --) {
//			System.out.println(start);
//			Thread.sleep(1000);
//		}
		
		int counter = 10; 
		do {
			System.out.println(counter);
			Thread.sleep(1000);
			counter --;
		}while (counter >= 0);
	}
}
