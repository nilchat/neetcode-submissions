class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char c: s.toCharArray()){
            // Closing bracket
            if(map.containsKey(c)){
                if(!stack.isEmpty() && map.get(c) == stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            // Open bracket
            else{
                stack.push(c);
            }
            
        }
        return stack.isEmpty();
        
    }
}
