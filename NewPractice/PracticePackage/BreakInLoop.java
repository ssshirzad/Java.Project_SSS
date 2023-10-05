package PracticePackage;

public class BreakInLoop {
	// While loop : Don't know the number of iterations
	// do while : don't know iteration but want to execute code at least once irrespective of condition 
	// for loop : when you know the number of iteration up front 

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i==7) {
				break;
				//as soon as the loop reaches 7, it will break
				//Usage : when you stop loop once it finds the value you're looping for
			}
			System.out.println(i);
		}
		System.out.println("Last statement");

	}

}
