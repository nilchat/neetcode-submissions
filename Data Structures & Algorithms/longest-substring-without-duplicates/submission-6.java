class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()){
            char rightChar = s.charAt(right);
            if(set.contains(rightChar)){
                while(set.contains(rightChar)){
                    char leftChar = s.charAt(left);
                    set.remove(leftChar);
                    left++;
                }
            } 

            set.add(rightChar);
            maxLen = Math.max(maxLen, right - left + 1);   
            right++;

        }

        return maxLen;
        
    }
}
