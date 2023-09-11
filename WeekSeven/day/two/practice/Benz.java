package day.two.practice;

public class Benz extends Vehicle{
	
	public Benz(String model) {
		super(model);
	}
	
	public void driving() {
		System.out.println("Benz Driving");
	}

	@Override
	public boolean isKeyLess(boolean isKeyLess) {
		return false;
	}
}
