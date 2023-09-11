package tek.dragons.week.eight.day_two;

public interface BaseDatabaseOperator {
	// We can NOT have regular method in interface. 
//	public void print() {}
	
	//Method signature
	public void select();
	
	public void delete();
	
	public void update();
}
