class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            int windowLength = right - left + 1;
            maxLength = Math.max(maxLength, windowLength);
            right++;
        }

        return maxLength;
        
    }
}
