package day.one;

public class TestRunner {
public static void main(String[] args) {
		
		String type = "chrome";
		Browser browser; 
		
		if (type.equals("chrome")) {
			browser = new Chrome(); 
		}else {
			browser = new Edge();
		}
		
		browser.openBrowser();
		browser.close();
	}
}
