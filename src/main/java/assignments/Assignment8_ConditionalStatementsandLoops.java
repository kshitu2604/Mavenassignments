package assignments;

import java.util.LinkedList;
import java.util.List;

public class Assignment8_ConditionalStatementsandLoops {

	public static void main(String[] args) {

	/*Bank Transactions
		Positive value refers Credit and Negative refers Debit Transaction
		Transactions Amount
		1           50000
		2           -2000
		3 			 3000
		4 			-15000
		5 			-200
		6 			-300
		7			 4000
		8 			-3000
First Store all the transactions in any data structure of Your Choice from collections, and by using
Loops and conditional statements*/
		
		List<Integer>Amt =  new LinkedList<Integer>();

		Amt.add(50000);
		Amt.add(-2000);
		Amt.add(3000);
		Amt.add(-15000);
		Amt.add(-200);
		Amt.add(-300);
		Amt.add(4000);
		Amt.add(-3000);
	
	//1. Print total number of credit and debit transactions completed
	int Count = 0;
	int Count1 = 0;
	for(int Trans : Amt){
		if(Trans > 0){
			Count = Count + 1;
		}
		else {
			Count1 = Count1 + 1;
		}
	}
	System.out.println("Total Number of Credit Transactions = "+ Count );
	System.out.println("Total Number of Debit Transactions = "+ Count1);
	
	//2. Print the total amount credited and debited in account
    int CreditAmount = 0;
    int CreditAmount1= 0;
	for(int Trans1 : Amt){
		if(Trans1 > 0){
			CreditAmount = CreditAmount + Trans1;		
		}
		else {
			CreditAmount1= CreditAmount1+ Trans1;
		}
	}
	System.out.println("Total Amount of Credit Transactions = "+ CreditAmount);
	System.out.println("Total Amount of Debit Transactions= "  +CreditAmount1);
	
	// 3. Print total amount remaining at the end in Bank Account
	System.out.println("Print total amount remaining at the end in Bank Account= " + (CreditAmount-CreditAmount1));
	
	/*. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
	Transaction with Amount” and also print total number of suspicious transactions*/
	 int SuspiciousAmt = 0;
	    int SuspiciousAmt1 = 0;
		for(int Trans2: Amt){
			if(Trans2 > 10000) {
				System.out.println("Credit Suspicious Transaction Amount = " + Trans2);
				SuspiciousAmt = SuspiciousAmt + 1;		
				
			}
			else if (Trans2 < -10000) {
				System.out.println("Credit Suspicious Transaction Amount = " +Trans2);
				SuspiciousAmt1= SuspiciousAmt1+ 1;
			}
		}
		System.out.println("Total number of Credit Suspicious Transactions = " + SuspiciousAmt);
		System.out.println("Total number of Debit Suspicious Transactions = "  +SuspiciousAmt1);
	
	}
	
}

