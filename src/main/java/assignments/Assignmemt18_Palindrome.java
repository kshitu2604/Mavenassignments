package assignments;

public class Assignmemt18_Palindrome {

	public static void main(String[] args) {
		
		String sentence = "A man, a plan, a canal: Panama";
		
		String cleaned = sentence.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
		
		System.out.println(cleaned);
		
		String reversed = "";
		
		for (int i = cleaned.length() - 1; i >= 0; i--) {
			reversed = reversed + cleaned.charAt(i);
		}
		if(cleaned.equals(reversed)) {
            System.out.println(sentence + " is a palindrome");
		} else {
            	System.out.println(sentence + " is not a palindrome");
            }
		
		
		
	
	}
}
