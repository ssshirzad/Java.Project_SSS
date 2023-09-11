package tek.dragons.week.ten.day_one;

public class Activity2 {
	public static void main(String[] args) {
		String text = "Somet67hing123";
		//Remove any number in that String 
		//[0-9] range of digits. 
		//[A-Z] range of alphabet A-Z upper case. 
		//[a-z] range of alphabet a-z lower case. 
		//[^0-9]  ^ = NOT 0-9 digits. 
		
		String replaced = text.replaceAll("[0-9]", "");
		String keepNumber = text.replaceAll("[^0-9]", "");
		System.out.println(replaced);
		System.out.println(keepNumber);		
	}
}
