package day.three;

public class AlexChild {
	//Inherit to Alex Class
	public class AlexChild extends Alex {

		public void alexChildAccessingParents() {
			// do we have acces to Alex Variable?
			System.out.println(alexVariable);

			// do this have access to Parent Variable
			System.out.println(parentVariable);
			// form here -> alex -> parent
			// does this have access to John's variables
//			System.out.println(johnVariable);
//			johnMethod();
			
		}

	}
}
