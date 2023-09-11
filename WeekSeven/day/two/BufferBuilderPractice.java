package day.two;

public class BufferBuilderPractice {
	
	public static void main(String[] args) {
		
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Schafie");
		buffer.append(" ");
		buffer.append("Shirzad");
		
		System.out.println(buffer.toString());
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(buffer);
		builder.append(" ");
		builder.append(34);
		
		System.out.println(builder.toString());
							
	}

}
