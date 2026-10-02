class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> numSet = new HashSet<>();
        int left = 0;
        int right = 0; 
        int maxLength = 0; 
        while(right < s.length()){
            while(numSet.contains(s.charAt(right))){
                numSet.remove(s.charAt(left));
                left++;
            }
            numSet.add(s.charAt(right));
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            right++;
        }
        return maxLength;
    }
}
