package assignments;

import java.util.List;

public class Assignment15_Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Assignment: Write a program to perform the following tasks:
//			String sentence = "Java programming is fun and challenging";
		
//		1. Count the total number of words in the sentence.
		String sentence = "Java programming is fun and challenging";
		System.out.println(sentence.length());
		
//		2. Print the sentence words in reverse order.	
		String sentence1 = "Java programming is fun and challenging";
		String reverse1 = "";
		
		String[] values = sentence1.split(" ");
		
		for (int i = values.length-1; i >= 0 ;i--) {
			reverse1 = reverse1 + " " +values[i];
		}
		System.out.println(reverse1);
		
//		3. Convert the first character of each word to uppercase and print original sentence
		String sentence2 = "Java programming is fun and challenging";
		String[] values1 = sentence2.split(" ");
		
		 StringBuilder result = new StringBuilder();
		 
		 for (String word : values1) {
			 String capital1 = word.substring(0, 1).toUpperCase() + word.substring(1);
	            result.append(capital1).append(" ");
	        }
		   System.out.println("Original Sentence: " + sentence);
	        System.out.println("Modified Sentence: " + result.toString());
	        
	        
	}

}
