/**
Given an array of prices, find a single day to purchase a price and a different day to sell (with the most profit possible), return the maximum profit achieved. You don't have to make a transaction (in which profit would be 0).

inputs: int[] prices
outputs: int profit

Two Pointer Solution
We want to buy at a low price and sell at a higher price that comes after it. 
Step 0:set two pointers (l = 0, buy day) and (r = 1, sell day) 
step 0.5: initialize maxProfit 
STep 1: while r is in array index: 
if (prices[r] > prices[l]) compute profit and update maxProfit
step 2: if prices[r] is not greater than prices[l], move l to r 
step 3: continue to iterate r to the next day. 
step 4: return maxProfit.


**/
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
