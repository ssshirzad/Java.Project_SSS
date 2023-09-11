package tek.dragons.week.eight.day_two;

public class InterfaceTesting {
	public static void main(String[] args) {
		// we can't create object from Interface. 
//		BaseDatabaseOperator object = new BaseDatabaseOperator();
		
		BaseDatabaseOperator table1 = new DatabaseTable1(); 
		table1.select();
	}
}
