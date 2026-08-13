/**
Given an array of prices, find a single day to purchase a price and a different day to sell (with the most profit possible), return the maximum profit achieved. You don't have to make a transaction (in which profit would be 0).

inputs: int[] prices
outputs: int profit

Dynamic programming Solution? 
Keep track of lowest day == best day to buy
find highest day after buy day == best day to sell with maximum profit. 

Step 0: initialize maxProfit variable, minBuy variable prices[0]
Step 1: initialize for loop to iterate prices[]
Step 2: calculate maxProfit -> Math.max(maxProfit, sell = minBuy)
Step 3: calculate minBuy -> Math.min(minBuy, sell)
Step 4: return maxProfit variable 


**/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0];

        for (int sell: prices) {
            maxProfit = Math.max(maxProfit, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }

        return maxProfit;
    }
}
