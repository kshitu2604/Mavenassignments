package assignments;

import java.util.Scanner;

public class Assignment17_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Assignment: Write a program to print * in triangle pattern
//		1. If I will pass int rows = 5 then it should print triangle with 5 Rows
//		*
//		**
//		***
//		****
//		*****
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows in triangle");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<= n ;i++) {
			for(int j = 1 ; j<= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
