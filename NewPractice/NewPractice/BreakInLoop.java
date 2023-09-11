package NewPractice;

public class BreakInLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			//as soon as the loop reaches 7, it will break
			//Usage : when you stop loop once it finds the value you're looping for
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Final statement");

	}

}
