package day.two.practice;

public class BikeTester {
	
	public static void main(String[] args) {
		
		Bike myBike = new Bike("Shwin", "Sports", 4, 145.75);
		
		double sellingBike = myBike.sellBike(123.99);
		System.out.println(sellingBike);
		
		int bikeGear =myBike.gear = 4;
		System.out.println(bikeGear);
		myBike.brake();
		
		int bikeDownShift = myBike.downShift(3);
		System.out.println(bikeDownShift);
		
		Bike yourBike = new Bike("Honda", "Mountian", 5, 199.99);
		
		yourBike.downShift(4);
		yourBike.brake();
		
		
	}

}
