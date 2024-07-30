/* 
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and 
choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0

Example:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed,
because you must buy before you sell.
*/

public class buy_and_sell_stocks_leetcode {

    public static int buyAndSellStocks(int prices[]) {
        
        int max_profit = 0;
        int buying_price = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buying_price < prices[i] ) { // Case of profit
                int current_profit = prices[i] - buying_price;
                max_profit = Math.max(max_profit, current_profit);

            } else {
                buying_price = prices[i]; // Case of loss. So set buying price as current price.
            }
        }

        return max_profit;
    }
    
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4};

        System.out.println(buyAndSellStocks(prices));
    }
    
}
