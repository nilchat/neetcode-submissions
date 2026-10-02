class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int maxFreq = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            int freq = map.get(s.charAt(right));
            maxFreq = Math.max(freq, maxFreq);
            
            if((right - left + 1) - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
     return maxLength;   
    }
}
