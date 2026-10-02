class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){

            char rightChar = s.charAt(right);

            if(seen.contains(rightChar)){
                while(seen.contains(rightChar)){
                    seen.remove(s.charAt(left));
                    left++;
                }
            }

            seen.add(rightChar);
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        }

        return maxLen;
    }
}
