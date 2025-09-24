package Practicediffpack;


public class Practice4 {
	
   
		

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
	
		
		String value = " Username : Admin | Password : admin123 ";
		

		// Total number of characters available within the string.==> String.length();
		System.out.println(value.length());

		//Get a specific character from a specific index of a string.==>
		// String.charAt(index);
		System.out.println(value.charAt(5));
		
		// Print the reverse string of the original value.
		String reverseValue = "";
		for(int i = value.length()-1 ; i>=0 ; i-- ) {
			reverseValue = reverseValue + value.charAt(i);
		}
		System.out.println(reverseValue);
		
		 //Remove the unwanted spaces within the string. ==> String.trim();
		 System.out.println(value.trim());
		 
		// Removing all the spaces from the string.==> String.replace(oldChar, newChar);
		 System.out.println(value.replace(" ", ""));
		
		// Removing all the ALPHABETS from the string.==> String.replaceAll(regExp,
			// newChar);
		 System.out.println(value.replaceAll("[a-zA-z]",""));
		 
		// Removing all the NUMBERS from the string.==> String.replaceAll(regExp,
			// newChar);
		 System.out.println(value.replaceAll("[0-9]",""));
		 
			// Removing all the SPECIAL CHARS from the string.==> String.replaceAll(regExp,
			// newChar);
		 System.out.println(value.replaceAll("^[0-9A-Za-z]",""));
		 
			// Change the case of characters within the string.==> String.toLowerCase() /
			// String.toUpperCase();
		 System.out.println(value.toUpperCase());
		 System.out.println(value.toLowerCase());
		
		 //Extract the substring from the string.==> String.substring(startIndex,
					// endIndex+1);
		 System.out.println("Username:" + value.substring(12, 17));
			System.out.println("Password:" + value.substring(31));
		
			// Extract the username and password from the dynamic string and print them
			// separately.
			String[] values = value.split(" ");
			System.out.println("Username:" + values[3]);
			System.out.println("Password:" + values[7]);
			
			
		
		
			String name = "Bharath";
			System.out.println(name.equals("Bharath")); //true
			System.out.println(name.equals("bharath"));//false
			System.out.println(name.equalsIgnoreCase("bharath"));//true
			System.out.println(name.contains("hara"));//true
			System.out.println(name.contains("Hara"));//false
			System.out.println(name.startsWith("Bha"));//true
			System.out.println(name.endsWith("rath"));//true
			
			
			System.out.println(value);
			
		
	}

}	


