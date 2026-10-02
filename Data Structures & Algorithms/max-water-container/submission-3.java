class Solution {
    public int maxArea(int[] heights) {
        int maxVol = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left <= right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int vol = height * width;
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
