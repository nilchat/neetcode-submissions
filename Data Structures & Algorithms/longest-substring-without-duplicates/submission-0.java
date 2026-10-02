class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> seen = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(c);
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            right++;
        }
        return maxLength;

    }
}
