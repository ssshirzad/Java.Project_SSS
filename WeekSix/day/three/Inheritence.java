package day.three;

public class Inheritence {
	public class Alex extends Parent{
		
		public String alexVariable = "This is Alex";
		
		public void alexMethod() {
			System.out.println("This method from Alex");
		}
		
		public void alexUsingParentVariable() {
			System.out.println(parentVariable);
			parentMethod();
		}

	}
}
