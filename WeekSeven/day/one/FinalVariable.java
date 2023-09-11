package day.one;

public class FinalVariable {
	//An Instance variable that is final should be assigned 
	//right away after declaration or using the constructor of the class. 
	
	public final String variable; 
	
	public FinalVariable(String variable) {
		this.variable = variable; 
	}
	
	public FinalVariable() {
		this.variable = "Something";
	}
	
	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable("Some values");
		//final variable is not allowed to re-assign
//		obj.variable = "Some other value";
		
		
	}
}
