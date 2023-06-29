//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
//Difficulty: Medium

class Solution {
    public int maxProfit(int[] prices) {
        int currentProfit = 0;
        int lastPrice = 0;
        boolean isHeld = false;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] > prices[i + 1] && isHeld){
                isHeld = false;
                currentProfit += prices[i] - lastPrice;
            }
            if(prices[i] < prices[i + 1] && !isHeld){
                isHeld = true;
                lastPrice = prices[i];
            }
        }
        if(isHeld){
            currentProfit += prices[prices.length - 1] - lastPrice;
        }
        return currentProfit;
    }
}