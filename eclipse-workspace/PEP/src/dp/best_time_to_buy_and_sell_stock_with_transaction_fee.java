package dp;

import java.util.Scanner;

public class best_time_to_buy_and_sell_stock_with_transaction_fee {

	public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] prices= new int [n];
        for(int i=0;i<n;i++){
            prices[i]=scn.nextInt();
        }
        int fee=scn.nextInt();
        System.out.print(maxProfit(prices, fee));
	 }
	 // -----------------------------------------------------
	 // This is a functional problem. Only this function has to be written.
	 // This function takes as input an array and an integer
	 // It should return the required output

	 public static int maxProfit(int[] prices, int fee) {
	 	 //Write your code here
		 int buy = prices[0]*-1;
		 int profit = 0;
		 
		 for(int i=1;i<prices.length;i++)
		 {
			 int buytemp = buy;
			 int profittemp = profit;
			 
			 buy = Integer.max(buytemp, profittemp-prices[i]);
			 profit = Integer.max(profittemp, buytemp+prices[i]-fee);
			 buytemp = buy;
			 profittemp = profit;
		 }
		 
		 return profit;
	 }
}
