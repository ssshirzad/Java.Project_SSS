package tek.dragons.week.seven.day_one;

public class SuperClass {
	protected String superClassVariable; 
	
	public SuperClass (String constructorParam) {
		this.superClassVariable = constructorParam;
	}
	
	
	public void printVariable() {
		System.out.println(superClassVariable);
	}
}
