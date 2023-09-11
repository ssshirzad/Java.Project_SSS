package day.four;

public class BrowserTesting {
	public static void main(String[] args) {
		String type = "edge";
		
		//Declare browser variable
		// then depend of type of is will instantiate.
		Browser browser; 
		
		if (type.equals("chrome")) {
			browser = new Chrome(); 
		}else if (type.equals("safari")) {
			browser = new Safari();
		}else {
			browser = new Edge(); 
		}
		
		browser.lunchBrowser();
	}
}
