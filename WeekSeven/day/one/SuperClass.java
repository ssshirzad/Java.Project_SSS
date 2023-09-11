package day.one;

public class SuperClass {
	protected String superClassVariable; 
	
	public SuperClass (String constructorParam) {
		this.superClassVariable = constructorParam;
	}
	
	
	public void printVariable() {
		System.out.println(superClassVariable);
	}
}
