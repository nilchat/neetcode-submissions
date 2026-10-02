class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longestSeqLength = 0;

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int len = 0;
                while(set.contains(nums[i] + len)){
                    longestSeqLength = Math.max(longestSeqLength, ++len );
               
                }
            }

        }

        return longestSeqLength;
        
    }
}
