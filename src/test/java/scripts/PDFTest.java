package scripts;

import utilities.PDFUtil;

public class PDFTest {

	public static void main(String[] args) {
		String page2Text = PDFUtil.getText("TransactionsAssignment.pdf", 1, 1);
		String[] values = page2Text.split(" ");				
				
		double totalamount = 0.0;
		
		for (String val : values) {
			try {
				double amount = Double.parseDouble(val);
				totalamount += amount;
				System.out.println("Amount Found " + amount);
			} catch (Exception e) {

			}
		}
	System.out.println("===================================");	
	System.out.println("Total Amount: " + totalamount);	
	
	}
}
