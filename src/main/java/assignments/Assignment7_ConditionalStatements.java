package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		
		if(creditScore>750) {
			System.out.println("Te loan is automatically approved.");
		}else if(creditScore>= 650 && creditScore<= 750) {
				System.out.println("The loan is automatically approved.");
				 if(income >= 50000) {
				   } if(isEmployed== true) {
					 System.out.println("employed loan passed"); 
				 		} if(debtToIncomeRatio < 40) {
				 			System.out.println("Loan is Approved");
				 		}else if(debtToIncomeRatio > 40) {
				 			System.out.println("Loan is Denied");
				 			} 
				 	else if(isEmployed== false) {
					 System.out.println("employed loan denied");
				 }			 
			}else if(creditScore < 650) {
					System.out.println("Te loan is denied.");
				}
	
			}
	}


