class Solution {
    public String minWindow(String s, String t) {

        if(t.length() > s.length()){
            return "";
        }

        HashMap<Character, Integer> expectedFreq = new HashMap<>();

        for(char c: t.toCharArray()){
            expectedFreq.put(c, expectedFreq.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowFreq = new HashMap<>();
        int have = 0;
        int need = expectedFreq.size();
        int resLen = Integer.MAX_VALUE;
        int[] res = {-1, -1};

        int left = 0;
        int right = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);
            if(expectedFreq.containsKey(c) && windowFreq.get(c).intValue() == expectedFreq.get(c).intValue()){
                have++;
            }

            while(have == need){
                if ((right - left + 1) < resLen) {
                    resLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (expectedFreq.containsKey(leftChar) && windowFreq.get(leftChar) < expectedFreq.get(leftChar)) {
                    have--;
                }
                left++;

            }

            right++;


        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
        
    }
}
