class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int maxWaterVol = 0;

        while(left < right){
            int minHeight = Math.min(heights[left], heights[right]);
            int length = right - left;
            int waterVol = minHeight * length;
            maxWaterVol = Math.max(maxWaterVol, waterVol);
            if(heights[left] < heights[right]){
                left++;
            }
            else if(heights[left] > heights[right]){
                right--;
            }
            else{
                left++;
                right--;
            }

        }
        return maxWaterVol;
        
    }
}
