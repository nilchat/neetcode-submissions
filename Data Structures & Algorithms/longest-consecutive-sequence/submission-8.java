class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();
        int maxCount = 0;
        // Populate the hashset
        for(int num:nums){
            numSet.add(num);
        }
        // Check for the start element in the hashset
        for(int num:nums){
            if(!numSet.contains(num - 1)){
                int count = 0;
                while(numSet.contains(num + count)){
                    count++;
                    maxCount = Math.max(maxCount, count);
                }
            }
        }
        return maxCount;
    }
}
