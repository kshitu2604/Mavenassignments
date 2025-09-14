package assignments;

public class Assignment12_Primenum {
	
	static String isPrime (int num) {
		int count = 0;
		if (num <= 1) {
			return (num + " is Not Prime Number");
		} else {
			for (int i =1; i <= num ;i ++)
				if (num % i==0) {
					count ++;
				}
		}
		if (count ==2)
			return (num + " is Prime number");
		else {
			return (num + " is Not Prime number");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(isPrime(5));

	}

}
