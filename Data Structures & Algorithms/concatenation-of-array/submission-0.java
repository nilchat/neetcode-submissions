class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        int index = 0;

        for(int num:nums){
            ans[index++] = num;
        }
        for(int num:nums){
            ans[index++] = num;
        }
        return ans;
        
    }
}