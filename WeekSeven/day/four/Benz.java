package day.four;

public class Benz extends Vehicle {
	public Benz() {
		super("Mercedes");
	}
	
	public void running() {
		System.out.println("Benz Running Fast");
	}

	@Override
	public void keylessStart(boolean isKeyless) {
		System.out.println(isKeyless);
	}
}
