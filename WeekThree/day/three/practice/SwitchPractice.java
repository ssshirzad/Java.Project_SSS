package day.three.practice;

public class SwitchPractice {

	public static void main(String[] args) {
		
		String browser = "CHROME";
		
		switch(browser.toLowerCase()) {
		case "edge":
			System.out.println("Opening in Edge");
			break;
		case "chrome":
			System.out.println("Opening in Chrome");
			break;
		case "safari":
			System.out.println("Opening in Safari");
			break;
		case "interner Browser":
			System.out.println("Opening in Internet Browser");
			break;
		default:
			System.out.println("Incompatible browser");
			break;
		}
	}
}
