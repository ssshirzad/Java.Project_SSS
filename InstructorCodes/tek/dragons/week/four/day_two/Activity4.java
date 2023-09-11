package tek.dragons.week.four.day_two;

public class Activity4 {
	//create a count down application from 10 to 0; 
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 10 ; i >= 0 ; i--) {
			System.out.println(i);
			//Off topic Thread.sleep(); for milisecond. 1000ms == 1 second 
			Thread.sleep(5000);
		}
		
	}
}
