package PracticePackage;

public class NestedLoop {

	public static void main(String[] args) {
		int counter = 0;
		
		for(int i = 1; i <= 4; i++) {
			int j = 1;
			while(j < 5) {
				System.out.println("Value of I: "+i+" Value of J: "+j);
				j++;
				counter++;
				
			}
		}
		System.out.println(counter);

	}

}
