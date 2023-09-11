package day.one;

public class RecapSelection {
	public static void main(String[] args) {

		

//		if (number > 100) {
//			System.out.println("Number is greater than 100");
//		} else {
//			System.out.println("Number is less than 100");
//		}

		String browser = "chrome";

		// both selections.
		if (browser.equals("chrome")) {
			System.out.println("Running in Chrome");
		} else if (browser.equals("edge")) {
			System.out.println("Running in Edge");
		} else if (browser.equals("firefox")) {
			System.out.println("Running in Firefox");
		} else {
			System.out.println("Wrong input for browser. ");
		}

		switch (browser) {
		case "firforx":
			System.out.println("Running on firefox");
			break;
		case "chrome":
			System.out.println("Running in Chrome");
			break;
		case "edge":
			System.out.println("Running in Edge");
			break;
		default:
			System.out.println("Wrong input for browser");
			break;
		}

	}
}
