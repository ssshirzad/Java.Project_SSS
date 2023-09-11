package tek.dragons.week.eight.day_one;

public class Ford extends Vehicle{
	public Ford(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	public void running() {
		System.out.println("Ford Class: Ford cars run 220 MPH");
	}

	@Override
	public void keylessStart(boolean isKeyless) {
		// TODO Auto-generated method stub
		
	}
}
