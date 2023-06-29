//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Difficulty: Easy

class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int currentProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice) minPrice = prices[i];
            currentProfit = prices[i] - minPrice;
            if(currentProfit > maximumProfit) maximumProfit = currentProfit;
        }
        return maximumProfit;
    }
}