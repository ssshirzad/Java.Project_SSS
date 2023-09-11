package day.three;

public class Activity6Mine {
	public static void main(String[] args) {
		
	double [] digits = {10.11, 20.19, 13.44, 32.22};
	double total = 0;
	
	for(int index = 0; index < digits.length; index ++) {
		total += digits[index];
	}
	int subTotal = (int) total;
	System.out.println(subTotal);
	}

}
