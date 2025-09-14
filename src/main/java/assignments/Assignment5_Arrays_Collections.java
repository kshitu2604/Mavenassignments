package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_Arrays_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.

		Map<String, Integer> Citydetails = new LinkedHashMap<String, Integer> ();
		Citydetails.put("Mumbai",9876);
		Citydetails.put("Nashik",8765);
		Citydetails.put("Pune",5798);
		Citydetails.put("Nagpur",2145);
		Citydetails.put("Solapur",1965);

		System.out.println("The total area of the 3rd and 4th cities combined :" + (Citydetails.get("Pune") + Citydetails.get("Nagpur")));
		
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.

		Set<String>touristplace =  new LinkedHashSet<String>();
		touristplace.add("1.Agra");
		touristplace.add("2.Goa ");
		touristplace.add("3.Amritsar ");
		touristplace.add("4.Shimla ");
		touristplace.add("5.Ooty ");
		touristplace.add("6.Alleppey ");
		touristplace.add("7.Jaipur ");
		touristplace.add("8.Ladakh ");
		touristplace.add("9.Mysore ");
		touristplace.add("10.Darjeling");
		
		System.out.println(touristplace);
		System.out.println(touristplace.size());
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		
		List<Integer> array10num = new LinkedList<Integer>();
		array10num.add(100);
		array10num.add(200);
		array10num.add(300);
		array10num.add(400);
		array10num.add(100);
		array10num.add(100);
		array10num.add(700);
		array10num.add(800);
		array10num.add(900);
		array10num.add(1000);
		
		System.out.println("The Average of 5th and 6th Value:" + ((array10num.get(4)+ array10num.get(5))/2));
	
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> highest5_grossing_movies = new LinkedList<String>();
		highest5_grossing_movies.add("1.Avatar");
		highest5_grossing_movies.add("2.Avengers");
		highest5_grossing_movies.add("3.Titanic");
		highest5_grossing_movies.add("4.StarWars");
		highest5_grossing_movies.add("5.Jurassic park");
	
		System.out.println("The third movie on the list:" + highest5_grossing_movies.get(2));
		
	}

}
