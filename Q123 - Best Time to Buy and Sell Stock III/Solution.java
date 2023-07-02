//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
//Difficulty: Hard

class Solution {
    public int maxProfit(int[] prices) {
        int firstStockBuy = -prices[0];
        int secondStockBuy = Integer.MIN_VALUE;
        int firstStockSell = 0;
        int secondStockSell = 0;
        for(int i = 0; i < prices.length; i++){
            if(firstStockBuy < -prices[i]){
                firstStockBuy = -prices[i];
            }
            if(firstStockSell < firstStockBuy + prices[i]){
                firstStockSell = firstStockBuy + prices[i];
            }
            if(secondStockBuy < firstStockSell - prices[i]){
                secondStockBuy = firstStockSell - prices[i];
            }
            if(secondStockSell < secondStockBuy + prices[i]){
                secondStockSell = secondStockBuy + prices[i];
            }
        }
        return secondStockSell;
    }
}