class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxLength = 0;

        for(int num: nums){
            numSet.add(num);
        }

        for(int num: nums){
            //Find the start of the sequence
            int length = 1;
            if(!numSet.contains(num - 1)){
                while(numSet.contains(num + length)){
                    length++;
                }
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;        
    }
}
