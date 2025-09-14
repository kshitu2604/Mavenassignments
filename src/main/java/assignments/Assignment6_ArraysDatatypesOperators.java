package assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment6_ArraysDatatypesOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> StudentDetails = new LinkedHashMap<String, Integer> ();
		StudentDetails.put("Suresh",75);
		StudentDetails.put("Mahesh",80);
		StudentDetails.put("Naresh",82);
		 int a =10;
		System.out.println("Updated Marks"+" Suresh"+ StudentDetails.get("Suresh" + a)+ " Mahesh"+ StudentDetails.get("Mahesh" + 2) + " Naresh"+ StudentDetails.get("Naresh"));
		
		//Method2
		String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
		int[] marks = {75, 80, 82};
		
		int[] updatedMarks = new int[3];
		updatedMarks[0] = marks[0] + 10;
		updatedMarks[1] = marks[1] + 10;
		updatedMarks[2] = marks[2] + 10;
		
		System.out.println(studentNames[0] + " : " + updatedMarks[0]);
		System.out.println(studentNames[1] + " : " + updatedMarks[1]);
		System.out.println(studentNames[2] + " : " + updatedMarks[2]);
		
		int averageMarks = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / updatedMarks.length; 
		
		System.out.println("Average Marks: " + averageMarks);
	}
	}

