class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            // Not opening bracket
            if(!map.containsKey(c)){
                stack.push(c);
            }

            else{
                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();


    }
}
