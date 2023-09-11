package NewPractice;

public class ContinueInLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			//Once it reaches 7 loop, it will go to 8th loop and continue
			// Usage: when you want to skip some value in a loop
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Final statement");

	}

}
