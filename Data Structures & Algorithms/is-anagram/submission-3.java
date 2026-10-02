class Solution {
    public boolean isAnagram(String s, String t) {
        // Return false if length of s and t are not equal
        if(s.length() != t.length()){
            return false;
        }
        
        int[] freqs = new int[26];

        for(int i = 0; i < s.length(); i++){
            freqs[s.charAt(i) - 'a'] += 1;
            freqs[t.charAt(i) - 'a'] -= 1;
        }
        
        for(int freq: freqs){
            if(freq != 0)
            return false;
        }
        return true;

    }
}
