class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> uniqNums = new HashSet<>();
        int maxLength = 0;
        for(int num:nums){
            uniqNums.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            if(!uniqNums.contains(nums[i] - 1)){
                int length = 1; 
                while(uniqNums.contains(nums[i]+ length)){
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
