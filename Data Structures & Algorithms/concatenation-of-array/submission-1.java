class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        int index = 0;

        for(int i = 0; i < 2; i++){
            for(int num:nums){
            ans[index++] = num;
            }
        }
        return ans;
        
    }
}