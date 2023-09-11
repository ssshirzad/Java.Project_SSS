package tek.dragons.week.six.day_two;

public class TestNavigator {
	public static void main(String[] args) {
		WebSiteNavigator googleNavigator = new WebSiteNavigator("www.google.com");
		googleNavigator.navigate();
		
		WebSiteNavigator yahooNavigator = new WebSiteNavigator("www.yahoo.com");
		yahooNavigator.navigate();
		
		WebSiteNavigator facebookNavigator  = new WebSiteNavigator("www.facebook.com");
		facebookNavigator.navigate();
	}
}
