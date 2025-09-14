package assignments;

public class Assignment11_Diamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print the numbers in diamond-shaped pyramid of numbers.
		int n =5;
		for(int i=1; i<=n ; i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int k =1 ; k<=i ;k++) {
				System.out.print(k + " ");
				
			}
			System.out.println();
		}
		for (int i = (n-1);i >=1 ; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");	
			}
			for(int k =1; k <= i ;k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}

}
