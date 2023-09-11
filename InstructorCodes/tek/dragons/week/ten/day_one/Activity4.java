package tek.dragons.week.ten.day_one;
import java.util.ArrayList;
import java.util.Collections;
public class Activity4 {
	public static void main(String[] args) {
		ArrayList<String> emailList = new ArrayList<>();
		Collections.addAll(emailList, "john@gmail.com", "alex@yahoo.com", "mohammad@tekschool.us",
				"husnia@icloud.net" , "m.shokriyan@gmail.com");

		// from the above print the email provider. gmail or yahoo or tekschool
		for (String email : emailList) {

			// Check for valid email address. (should contain @).
			if (!email.isEmpty() && email.contains("@")) {
				int indexOfASign = email.lastIndexOf("@");
				int indexOfDot = email.lastIndexOf(".");
				//using substring and index numbers. 
				String provider = email.substring(indexOfASign, indexOfDot);
				System.out.println(provider);
			} else {
				System.out.println("Not a valid email -> " + email);
			}

		}
	}
}
