package day.three;

public class SeleniumActions {
	private String element; 
	
	public SeleniumActions(String element, String action) {
		this.element = element; 
		System.out.println(action);
	}
	
	public SeleniumActions(String element) {
		this.element = element; 
	}
	
	public void click() {
		System.out.println(element + " Clicked");
	}
	
	public void hover() {
		System.out.println("Hover over to " + element);
	}
}
