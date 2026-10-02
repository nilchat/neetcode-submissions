class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> expectedFreq = new HashMap<>();
        HashMap<Character, Integer> windowFreq = new HashMap<>();

        //Populate the expected frequency
        for(char c: t.toCharArray()){
            expectedFreq.put(c, expectedFreq.getOrDefault(c, 0) + 1);
        }      

        int left = 0;
        int right = 0;
        int have = 0;
        int need = expectedFreq.size();
        int minLen = Integer.MAX_VALUE;
        int[] res = {-1, -1};


        while(right < s.length()){
            char rightChar = s.charAt(right);
            windowFreq.put(rightChar, windowFreq.getOrDefault(rightChar, 0) + 1);
            if(expectedFreq.containsKey(rightChar) && expectedFreq.get(rightChar) == windowFreq.get(rightChar)){
                have++;
            }

            while(have == need){

                if((right - left + 1) < minLen){
                    minLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }
                     
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if(expectedFreq.containsKey(leftChar) && windowFreq.get(leftChar) < expectedFreq.get(leftChar)){
                    have--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);

    }
}
