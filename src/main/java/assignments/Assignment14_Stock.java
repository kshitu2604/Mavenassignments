package assignments;

public class Assignment14_Stock {
	
	public static int maxprofit(int[] prices) {
		
		int minprice = Integer.MAX_VALUE;
		
		int maxprofit = 0;
		
		for(int price : prices ) {
			if (price < minprice) {
				minprice = price;
			}else if (price - minprice > maxprofit) {
				maxprofit = price - minprice;
			}
		}
		
		return maxprofit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices1 = {7,1,5,3,6,4};
		int[] prices2 = {7,6,4,3,2,1};
		
		System.out.println(maxprofit(prices1));
		System.out.println(maxprofit(prices2));
		}

	}


