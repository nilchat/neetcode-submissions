class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String str: strs){
            builder.append(str.length()).append('#').append(str);
        }
        return builder.toString();

    }

    public List<String> decode(String str) {
        int i = 0;
        int j = 0; 
        List<String> res = new ArrayList<>();
        while(i < str.length()){
            while(str.charAt(j) != '#'){
                j++;
            }
            int n = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + n;

            res.add(str.substring(i,j));

            i = j;
        }

        return res;

    }
}
