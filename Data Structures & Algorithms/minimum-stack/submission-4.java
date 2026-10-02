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
        int top = -1;
        if(!stack.isEmpty()){
            top =  stack.peek();
        }
        return top;
    }
    
    public int getMin() {

        int minItem = Integer.MAX_VALUE;
        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty()){
            int num = stack.pop();
            minItem = Math.min(minItem, num);
            temp.push(num);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return minItem;
        
    }
}
