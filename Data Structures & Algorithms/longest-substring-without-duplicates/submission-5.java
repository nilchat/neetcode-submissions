class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            //invalid window
            if(seen.contains(c)){
                // Repeatedly move the left pointer until c is present in the HashSet
                while(seen.contains(c)){
                    seen.remove(s.charAt(left));
                    left++;
                }
            }

            maxLength = Math.max(maxLength, right - left + 1);
            seen.add(c);
            right++;
        }
        return maxLength;
    }
}
