package day.three.practice;

public class HandleException {
	
	public static void main(String[] args) {
		
		for (int start = 1; start <10; start++) {
			System.out.println(start);
		
		try {
		Thread.sleep(1000);
		}catch (InterruptedException exception) {
			System.out.println("InterruptedException during delay");
		}
	}

}
}