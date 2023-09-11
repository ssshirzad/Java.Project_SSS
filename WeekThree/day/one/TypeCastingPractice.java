package day.one;

public class TypeCastingPractice {
	public static void main(String[] args) {
		// Variable population = 12345;
		// Variable kidGenderPercent = 35;
		// Calculate how many kids living in the town;
		// Return me whole number;
		
		int population = 12345;
		int kidPercentage = 35;
		
		double kidLivingInArea = population * 35 / 100;
		System.out.println(kidLivingInArea);
		int castedResult = (int) kidLivingInArea;
		System.out.println(castedResult);
	}

}
