package day.two;

public class Laptop {
	
	private String make;
	private int HDR;
	private double price;
	
	public Laptop() {}
	
	public Laptop(String make, int HDR, double price) {
		this.make = make;
		this.HDR = HDR;
		this.price = price;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return this.make;
	}
	public void setHDR(int HDR) {
		this.HDR = HDR;
	}
	public int getHDR() {
		return this.HDR;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
}
