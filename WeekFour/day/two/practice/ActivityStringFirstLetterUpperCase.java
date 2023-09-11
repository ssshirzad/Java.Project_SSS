package day.two.practice;

public class ActivityStringFirstLetterUpperCase {
	
	public static void main(String[] args) {
		
		String text = "good morning";
		
		String result = text.substring(0, 1).toUpperCase() + text.substring(1);
		System.out.println(result);
		
	}

}
