package tek.dragons.week.eight.day_two;

public class Toyota extends Vehicle{
	//Vehicle class have constructor with parameters
	// we have to chain
	public Toyota() {
		super("Camry");
	}
	
	@Override
	public void running() {
		System.out.println("Toyota Max speed 180 MPH");
	}

	@Override
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}
}
