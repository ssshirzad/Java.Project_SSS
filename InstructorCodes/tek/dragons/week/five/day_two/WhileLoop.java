package tek.dragons.week.five.day_two;

public class WhileLoop {
	public static void main(String[] args) throws InterruptedException {
		//while loop need a condition to finish the loop 
		// as long as the condition is true it will repeat the loop. 
		// as soon as condition is false while loop will terminated.
		
		//print from 0 - 10 ; 
		
		int counter = 0; 
		
		//While (<Condition>)
		while(counter <= 10) {
			System.out.println(counter);
			Thread.sleep(200);
			counter ++;
		}
		
	}
}
