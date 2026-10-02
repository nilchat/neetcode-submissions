class Solution {
    public int maxArea(int[] heights) {

        int left = 0; 
        int right = heights.length - 1;
        int maxVol = 0;

        while(left < right){
            int minHeight  = Math.min(heights[left], heights[right]);
            int width = right - left;
            int vol = minHeight * width;
            maxVol = Math.max(maxVol, vol);

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
        return maxVol;
        
    }
}
