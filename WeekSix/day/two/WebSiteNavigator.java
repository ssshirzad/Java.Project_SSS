package day.two;

public class WebSiteNavigator {

	String websiteUrl; 
	
	//Default Constructor. 
	//NoArgsConstructor
	public WebSiteNavigator() {
		websiteUrl = "";
	}
	
	//Constructor have a block of code which will get executed
	// as soon as user instantiate object of the class. 
	//AllArgsConstructor
	public WebSiteNavigator(String url) {
		websiteUrl = url; 
	}
	
	//method to navigate. 
	public void navigate() {
		System.out.println("Navigatign to URL:: " + websiteUrl);
	}

}
