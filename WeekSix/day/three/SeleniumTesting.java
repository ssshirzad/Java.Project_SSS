package day.three;

public class SeleniumTesting {
	public static void main(String[] args) {
		BaseTest object = new BaseTest("Login Button");
		object.click();
		
		object.hover();
		
		BaseTest obj2 = new BaseTest("Submit Button");
		obj2.click();
		obj2.hover();

		
	}
}
