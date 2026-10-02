class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;

        while(!stack.isEmpty()){
            int num = stack.pop();
            min = Math.min(min, num);
            temp.push(num);
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return min;


        
    }
}
