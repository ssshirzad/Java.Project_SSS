package tek.dragons.week.six.day_three;

public class JohnChild extends John{
	public void johnChildUsingParent() {
		//does this class have access to John Private Variable? 
		//Private variables are not accessible. even through inheritance
		//System.out.println(johnPrivateVariable);
		
		//does this class have access to JohnPublicVariable
		System.out.println(johnPublicVariable);
		johnMehtod();
		
		
		//in-direct access to encapsulated variable using getter.
		getjohnPrivateVariable();
	}
}
