package day.four;

public class DatabaseTable1 implements BaseDatabaseOperator, DDLDBOperator{
	@Override
	public void select() {
		System.out.println("Table 1 Select Operator");
	}

	@Override
	public void delete() {
		System.out.println("Table 1 Delete operator");
	}

	@Override
	public void update() {
		System.out.println("Table 1 Update operator");
	}

	@Override
	public void drop() {
		System.out.println("Table 1 Drop Table operator");
	}

}
