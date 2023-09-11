package day.two.practice;

public class BrowserRunner {
	
	public static void main(String[] args) {
		
		String type = "Chrome";
		
		String Browser = "Chrome";
		
//		if(type.equals("Safari")) {
//			browser = new Safari();
//		}else if (type.equals("Chrome")) {
//			browser = new Chrome();
//		}else if (type.equals("Edge")) {
//			browser = new Edge();
//		}else {
//			System.out.println("Invalid web browser");
//		}
//		browser.launchBrowser();
		
		switch (Browser) {
		case "Edge":
			Browser Edge= new Edge();
			break;
		case "Chrome":
			Browser chrome = new Chrome();
			break;
		case "Safari":
			Browser safari = new Safari();
			break;
		}
		
		
		}
	
	}


