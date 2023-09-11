package day.two.practice;

public class DatabaseTable1 implements BaseDatabaseOperator , DDLDBOperator {

	@Override
	public void select() {
		System.out.println("Table1 select operator");
	
		
	}

	@Override
	public void delete() {
	System.out.println("table1 delete opertor");
		
	}

	@Override
	public void update() {
	System.out.println("table1 update operator");
		
	}

	@Override
	public void rename() {
		System.out.println("table1 rename opertor ");
		
	}

	@Override
	public void drop() {
	System.out.println("DDLDBOperator dropped");
		
	}

	@Override
	public void replace() {
	System.out.println("DDLDBOpertor replaced");
		
	}


	
	

}
