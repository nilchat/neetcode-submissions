class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxF = 0;
        int res = 0;

        while(right < s.length()){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
            maxF = Math.max(maxF, count.get(s.charAt(right)));

            while((right-left+1) - maxF > k){
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
        
    }
}
