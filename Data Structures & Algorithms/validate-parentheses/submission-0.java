class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char c:s.toCharArray()){
            // closing bracket
            if(map.containsKey(c)){
                if(!stk.isEmpty() && stk.peek() == map.get(c)){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            // opening bracket
            else{
                stk.push(c);
            }
           

        }
    return stk.isEmpty();
        
    }
}
