//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/
//Difficulty: Hard
//This solution is a generalized version of Q123.

class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][] transactions = new int[k][2];
        transactions[0][0] = -prices[0];
        for(int i = 0; i < prices.length; i++){
            for(int j = 0; j < transactions.length; j++){
                if(i == 0 && j != 0){
                    transactions[j][0] = Integer.MIN_VALUE;
                } 
                if(j == 0){
                    transactions[0][0] = Math.max(transactions[0][0], -prices[i]);
                    transactions[0][1] = Math.max(transactions[0][1], transactions[0][0] + prices[i]);
                } else {
                    transactions[j][0] = Math.max(transactions[j][0], transactions[j - 1][1] - prices[i]);
                    transactions[j][1] = Math.max(transactions[j][1], transactions[j][0] + prices[i]);
                }
            }
        }
        return transactions[k - 1][1];
    }
}