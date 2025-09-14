package assignments;

public class Assignment16_Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
//		indexes.
//		
//		2. Find total number of occurrences
//		3. Print count and Indexes of the word
//
//		String paragraph = "Java is a popular programming language. Java is used for web
//		development, mobile applications, and more.";"
		
		
		String para = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

	
		String[] values = para.split(" ");
		int count = 0;
		for(int i = 0 ; i <= values.length-1 ; i++) {
			if(values[i].equals("Java")){
				System.out.println(" Indexes of the Java word = " + (i+1));
				count = count  + 1;
			}		
		}
		System.out.println();
		

		System.out.println(" total number of occurrences = " + count);
		
	}

}
