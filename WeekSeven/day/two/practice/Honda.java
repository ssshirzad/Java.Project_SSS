package day.two.practice;

public class Honda extends Vehicle{

	public Honda(String model) {
		super(model);
		
	}

	@Override
	public void driving() {
		System.out.println("Honda driving");
		
	}
	@Override
	public boolean isKeyLess(boolean isKeyLess) {
		return true;
	

}
}
