class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqCount = new HashMap<>();
        int maxF = 0;
        int left = 0;
        int right = 0;
        int longest = 0;

        while(right < s.length()){
            freqCount.put(s.charAt(right), freqCount.getOrDefault(s.charAt(right), 0) + 1);
            maxF = Math.max(maxF, freqCount.get(s.charAt(right)));

            while((right - left + 1) - maxF > k){
                freqCount.put(s.charAt(left), freqCount.get(s.charAt(left)) - 1);
                left++;
            }

            longest = Math.max(longest, right - left + 1);
            right++;

        }
    return longest; 

        
    }
}
