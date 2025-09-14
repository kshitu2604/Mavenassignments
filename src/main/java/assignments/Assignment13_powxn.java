package assignments;

public class Assignment13_powxn {
	
	public static double Pow(double x , int n) {
		double result = 1;
		long exp = n;
		
		if(exp < 0) {
			x = 1/x;
			exp = -exp;
		}
		for (long i = 0; i <exp ; i++) {
			result = result * x;
		
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pow(-1,-3));

	}

}
