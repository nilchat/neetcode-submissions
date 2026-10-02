class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        while(sell < len){
            if(prices[sell] > prices[buy]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                // Find a cheaper price
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
        
    }
}
