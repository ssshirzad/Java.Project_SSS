package day.one;

public class TypeCasingActivity {
	
	// Variable population = 12345;
	// Variable kidGenderPercent = 35;
	// Calculate how many kids living in the town;
	// Return me whole number;
	
	public static void main(String[] args) {
		int population = 12345;
		double kidPercentage = 35;
		
		// Kids population is double value eventually
		// but with (int) casting we remove decimal point
		double kidlivingInTown = population*kidPercentage/100;
		
		System.out.println(kidlivingInTown);
		int castedKidInTown = (int) kidlivingInTown;
		System.out.println(castedKidInTown);
		
		
		
	}

}
