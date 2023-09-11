package review;

public class StreamIncrementDecrement {
	
	public static void main(String[] args) {
		int x =10; // we assigned value of 10 to x
		
		x += 5; // ===> x = x(10) +5 this means x(10) plus 5 which is 15
		
		System.out.println(x);
		System.out.println(x+5);
		System.out.println(x);
		
		// ++ <-- Increment 
		// -- <-- Decrement 
		
		System.out.println("Y variable"); // we're just showing what it is in print
		int y = 1;
		System.out.println(y); // print value of y which is 1
		System.out.println(y -1); // print vlue of y-1 which is 0
		System.out.println(y+1); // print value of y +1 which is 2
		System.out.println(--y); // now you changed the value of y ( pre increment)
								// // double -- means you decremented it
		System.out.println(y--);	// post increment				
								// the the value of y now have changed
		System.out.println(y); // now the value will print zero because it has decremented
		System.out.println(y+1);
		System.out.println(++y);
		System.out.println(y);
		
		// increment vs decrement
		// pre-increment and post increment
		
		int xx = 10;
		
		
	}

}
