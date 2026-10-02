class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxLen = 0;

        for(int num: nums){
            numSet.add(num);
        }        

        for(int num: nums){
            if(!numSet.contains(num - 1)){
                int len = 1;
                while(numSet.contains(num + len)){
                    len++;
                }

                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
