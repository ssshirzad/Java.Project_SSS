package day.three.practice;

public class Activity7A {
	// only print names that start with S
	// start point is index 0; 
	// what the end point => array.length
	// increment
	public static void main(String[] args) {
		
		String[] names = new String[6];
		
		names[0] = "King";
		names[1] = "kevin";
		names[2] = "Evan";
		names[3] = "Tim";
		names[4] = "Schafie";
		names[5] = "subhan";
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			if(name.startsWith("S") || name.startsWith("s")) {
				System.out.println(name);
			}
		}
		
		for (int j = 0; j < names.length; j++) {
			String name2 = names[j];
			char firstChar = name2.charAt(0);
			if(firstChar == 'K' || firstChar == 'k') {
				System.out.println(name2);
			}
		}
	}
}
