package day.three;

public class Activity7One {
	public static void main(String[] args) {
		String[] names = {"John", "Adam", "Bob", "Goarge"};
		
	for (int i = 0; i < names.length; i++) {
		String name = names[i];
		char charAt = name.charAt(0);
		if(charAt == 'A') {
			System.out.println(name);
		}
	}
		for (int j = 0; j < names.length; j++) {
			String name2 = names[j];
			if(name2.startsWith("B")) {
				System.out.println(name2);
			}
		}
	}
	

}
