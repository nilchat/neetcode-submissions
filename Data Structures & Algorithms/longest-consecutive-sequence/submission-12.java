class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int maxStreak = 0;

        for(int num: nums){
            numSet.add(num);
        }

        for(int num: nums){
            int streak = 0;
            while(numSet.contains(num + streak)){
                streak++;
            }

            maxStreak = Math.max(maxStreak, streak);

        }
        return maxStreak;

    }
}
