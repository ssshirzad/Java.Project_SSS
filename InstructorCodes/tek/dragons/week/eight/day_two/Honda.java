package tek.dragons.week.eight.day_two;

public class Honda extends Vehicle{
	
	public Honda() {
		super("Civic");
	}

	@Override
	public void running() {
		System.out.println("Honda Running 170 MPH ");
	}

	@Override
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}
}
