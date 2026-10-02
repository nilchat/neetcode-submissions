class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxLength = 0;
        for(int num:nums){
            numSet.add(num);
        }
        for(int num:nums){
            int length = 0, currentNum = num;
            while(numSet.contains(currentNum)){
                length++;
                currentNum++;
            }
            maxLength = Math.max(maxLength, length);
        }
        
        return maxLength;
    }
}
