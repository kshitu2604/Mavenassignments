package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Logger;

public class PracticeSelf{

	/*
	 * String instanceVal = "Hi, I am instance variable";
	 * 
	 * String instanceVal1 = "Hi, I am instance variable 1";
	 * 
	 * static String staticVal = "Hi, I am static variable";
	 */
	int  add1(int a, int b) {
		return a+b ;
	};
	
	static void displayMessage() {
		System.out.println("Hello");
	};
	

	public void greet(String name) {
		System.out.println("Hello, " + name);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.print("KShitija "); System.out.println("Raut");
		 * 
		 * System.out.printf("Hello, %s! You have %d new messages are %b.%n", "Alice",
		 * 5, true);
		 * 
		 * System.err.println("This is an error message!");
		 * 
		 * Logger log = Logger.getLogger(""); log.info("Logging an info message");
		 * 
		 * System.out.println("INFO: Application started...");
		 * System.err.println("ERROR: Something went wrong.");
		 */
		
		/*
		 * char examGrade = 'A'; System.out.println(examGrade);
		 * 
		 * String name= "Selenium"; System.out.println("name");
		 */
		
		/*int[] array1 = new int[] {1,2,3,4};
		System.out.println(array1[3]);
		 * System.out.println(array1[1]);
		 * 
		 * String[] str = new String[3]; str[0]="hello"; str[2]="World"; str[1]="dear";
		 * //str[4]="mnoy"; System.out.println(str[0]);
		 * 
		 * String[][] abc = new String[2][2]; abc[0][0]="kj"; abc[0][1]="rt";
		 * abc[1][0]="yt"; abc[1][1]="gt"; System.out.println(abc[0][1]);
		 * 
		 * 
		 * String[][] abc1 = new String[][] {{"kj","rt"},{"yt","gt"}};
		 * System.out.println(abc1[0][1]);
		 */
		
		//Class and Objects:
		/*
		 * PracticeSelf obj = new PracticeSelf(); System.out.println(obj.name);
		 * System.out.println(obj.val);
		 */
		
		/*
		 * System.out.println("========List - ArrayList==========================");
		 * List<String> Str1 = new ArrayList<String>(); Str1.add("raut");
		 * Str1.add("Kshitija"); Str1.add("Scholar"); System.out.println(Str1);
		 * 
		 * System.out.println("========List - LinkedList==========================");
		 * List<Integer> Str2 = new LinkedList<Integer>(); Str2.add(1); Str2.add(21);
		 * Str2.add(15); System.out.println(Str2);
		 * 
		 * System.out.println("================Set - HashSet============="); Set<String>
		 * employeeNamesSet = new TreeSet<String>(); employeeNamesSet.add("Lakshmi");
		 * employeeNamesSet.add("Sunil"); employeeNamesSet.add("Aadhi");
		 * employeeNamesSet.add("Anjali"); employeeNamesSet.add("Siddartha");
		 * employeeNamesSet.add("Lakshmi");
		 * 
		 * System.out.println(employeeNamesSet); System.out.println("Size : " +
		 * employeeNamesSet.size());
		 * 
		 * Set<Integer> employeeidsSet = new TreeSet<Integer>(); employeeidsSet.add(1);
		 * employeeidsSet.add(2); employeeidsSet.add(5); employeeidsSet.add(3);
		 * employeeidsSet.add(4); employeeidsSet.add(1);
		 * System.out.println(employeeidsSet);
		 * 
		 * System.out.println("============Map - HashMap============");
		 * 
		 * Map<String,Integer> employeeDetails = new Hashtable<String,Integer>();
		 * employeeDetails.put("Lakshmi",1); employeeDetails.put("Sunil",2);
		 * employeeDetails.put("Aadhi",5); employeeDetails.put("Anjali",3);
		 * employeeDetails.put("Siddartha",3); employeeDetails.put("Lakshmi",6); //
		 * employeeDetails.put("Suresh",null); //employeeDetails.put(null,1000); //
		 * employeeDetails.put(null,null); System.out.println(employeeDetails);
		 * System.out.println("Size : " + employeeDetails.size());
		 
		String LocalVar = "I am Local Variable";  
		System.out.println(LocalVar);
		
		//PracticeSelf obj1 = new PracticeSelf();
		//System.out.println(obj1.instanceVal);
		System.out.println(PracticeSelf.staticVal);
		
		System.out.println(new PracticeSelf().instanceVal1);*/
		
		
		/*
		 * //The syntax for ternary operator is: condition ? expression1 : expression2;
		 * int a =50 ; int b = 20; int d = (a>b)? (a+b) :(a-b); 
		 * System.out.println(d);
		 */
		
		//Switch Case Expressions in Java (Java 14+)
		/*
		 * String Day = "Thursday"; String results = switch(Day) { case "MONDAY",
		 * "FRIDAY" ,"Thursday" -> "Workday"; case "SATURDAY" , "SUNDAY" -> "Weekend";
		 * default -> "Invalid day"; }; 
		 * System.out.println(results);
		 */
		/*
		int[] numbers = {1, 2, 3, 4, 5};
		for (int num : numbers) {
		System.out.println(num);
		}
		
		for(int i = 0 ;i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	*/
		/*
		 * for (int i = 1; i < 10; i++) { if (i % 2 == 0) { continue; // Skips the
		 * current iteration when i is even } 
		 * System.out.println(i); }
		 */
		
		 
		
			System.out.println(new PracticeSelf().add1(2,3));
			
			PracticeSelf.displayMessage();
			 
			new PracticeSelf().greet("kshitija");
			
		
			/*
			 * final int marks = 100;// final variable System.out.println("Number is : " +
			 * marks); marks = 150;// generate error 
			 * System.out.println("Number is : " +
			 * marks);
			 */
			
			
			
}
	

	

}



