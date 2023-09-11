package tek.dragons.week.two.day_two;

public class StringSubstring {
	//substring() method. 
	// extracting some part of String as new String. 
	// substring method need index to extracts. 
	public static void main(String[] args) {
		//Hello Separate String. 
		// world Separate String. 
		String text = "Hello World";
		String helloSub = text.substring(0, 5);
		System.out.println(helloSub);
		
		String worldSub = text.substring(6);
		System.out.println(worldSub);
		
		String message = "Title: Good Morning";
		//extract "Good morning" only. 
		String greeting = message.substring(7);
		System.out.println(greeting);
		
		String city = "falls church";
		// falls 
		String firstPart =city.substring(0, 5);
		System.out.println(firstPart);
		// church
		String secondPart = city.substring(6);
		System.out.println(secondPart);
		
	}
}
