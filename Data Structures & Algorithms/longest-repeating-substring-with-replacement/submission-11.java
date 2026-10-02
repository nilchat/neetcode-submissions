class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int right = 0;
        int maxFreq = 0;

        while(right < s.length()){
            char rightChar = s.charAt(right);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(rightChar));

            while((right - left + 1) - maxFreq > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, (right - left + 1));
            right++;
        }
        return maxLen;
    }
}
