class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for(String str : strs){
            string.append(str.length()).append('#').append(str);
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        
        int i = 0;
        int j = 0;
        List<String> res = new ArrayList<>();

        while(i < str.length()){
            
            while(str.charAt(j) != '#'){
                j++;
            }

            int length =  Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;

            res.add(str.substring(i, j));
            i = j;
        }

        return res;

    }
}
