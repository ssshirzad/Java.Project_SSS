package tek.dragons.week.three.day_three;

public class SwitchCaseStatementExample {
	public static void main(String[] args) {
		String browser = "EdgE";

		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Opening in Chrome Browser");
			break;
		case "firefox":
			System.out.println("Opening in Firefox Browser");
			break;
		case "safari":
			System.out.println("Opening in Safari Browser");
			break;
		case "edge":
			System.out.println("Opening in Edge Browser");
			break;
		default:
			System.out.println("Wrong Browser");
			break;
		}

	}
}
