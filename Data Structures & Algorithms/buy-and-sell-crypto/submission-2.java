class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while(right < len){
            if(prices[right] > prices[left]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                // Find a cheaper price
                left = right;
            }
            right++;
        }
        return maxProfit;
        
    }
}
