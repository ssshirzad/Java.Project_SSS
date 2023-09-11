package day.four;

public class Activity1Practice {
	// Create a method that take a int number and 
			// return true if number is odd otherwise return false;
			
			//5 minute
	String nooryah;
	String party;
	public Activity1Practice(String nooryah, String party) {
		this.nooryah = nooryah;
		this.party = party;
	}
	
	public boolean evenOddNumber(int number) {
		if (number % 2 == 0) {
			return false;
		}else {
			return true;
		}
		
	}
	public boolean isInTheParty() {
		if (!nooryah.equals(party)) {
			return true;
		}else {
			return false;
		}
	}
	
	public double giftPrice(double giftPrice) {
		return giftPrice;
		
	}
}
