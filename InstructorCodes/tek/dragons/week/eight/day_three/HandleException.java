package tek.dragons.week.eight.day_three;

public class HandleException {
	public static void main(String[] args) {
		
		for(int start = 10; start >= 0 ; start --) {
			
			System.out.println(start);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException exception) {
				System.out.println("Interrupted Exception Happeded during sleep time. ");
			}	
		}	
	}
}
