package day.three;

public class JohnParent {
	public class John extends Parent{
		
		private String johnPrivateVariable = "This is John Private Variable";
		
		public String johnPublicVariable = "This is Johns public variable";
		
		public void johnMehtod() {
			System.out.println("This is John Method");
		}
		
		public void johnUsingParentMethod() {
			System.out.println(parentVariable);
			parentMethod();
		}
		
		public String getjohnPrivateVariable() {
			return this.johnPrivateVariable;
		}
}
