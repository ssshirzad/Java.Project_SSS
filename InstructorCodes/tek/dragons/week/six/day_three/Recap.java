package tek.dragons.week.six.day_three;

public class Recap {
	//Encapsulated variable with using private access modifier. 
	private String url;
	
	public Recap(String url) {
		this.url = url;
	}
	
	public void printURL() {
		System.out.println("URL is:: " + this.url);
	}
	
	//Create in-direct access 
	//getter -> return the value of encapsulated variable 
	public String getUrl() {
		return this.url;
	}
	//setters. -> set the value for encapsulated variable. 
	public void setUrl(String url) {
		this.url = url;
	}
}
