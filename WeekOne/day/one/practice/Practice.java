package day.one.practice;

public class Practice {
	String name;
	String job;
	//this can be used to refer to the current class instance variable.
	public Practice(String name, String job) {
		this.name = name;
		this.job = job;

	}
	//this() can be used to invoke the current class constructor.
	public Practice() {
		this("name", "job");

	}
	//this can be used to invoke current class method (implicitly)
	public void firstMethod(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void secondMethod() {
		this.firstMethod(9, 8);
	}
	
	public void printNameAndJob() {
		System.out.println("Name: "+ this.name + this.job);
		
	}

}
