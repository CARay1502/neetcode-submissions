/**
Given an array of prices, find a single day to purchase a price and a different day to sell (with the most profit possible), return the maximum profit achieved. You don't have to make a transaction (in which profit would be 0).

inputs: int[] prices
outputs: int profit

Brute force method: 
step 0: initialize profit variable
step 0.5: initialize a for loop to iterate through int[] prices array. 
step 1: initialize inner for loop.
step 2: using prices[0] iterate through array to calculate if selling prices[j] profit >= 0 (or greater than previous best profit). 
step 3: iterate to next element in prices array and repeat. 
step 4: return profit (even if 0).

**/
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = (i + 1); j < prices.length; j++) {
                if ((prices[j] - prices[i]) > profit) {
                    profit = (prices[j] - prices[i]);
                }
            }
        }
        return profit;
    }
}
