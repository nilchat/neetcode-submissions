class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for(String str: strs){
            int[] freq = new int[26];

            for(char c: str.toCharArray()){
                freq[c - 'a'] += 1;
            }

            String key = Arrays.toString(freq);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
