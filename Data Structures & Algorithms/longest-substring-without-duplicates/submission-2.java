class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int right = 0; 
        int maxLength = 0; 
        while(right < s.length()){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            right++;
        }
        return maxLength;
    }
}
