class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // Track the lowest buying price
        int left = 0;
        // Search the best selling price
        int right = 1;
        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }
            int profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit, profit);
            right++;
        }

        return maxProfit;
    }
}
