class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minIntStack;
    public MinStack() {
        stack = new Stack<>();
        minIntStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(stack.size()==1){
            minIntStack.push(val);
        } else{
            if(val<=minIntStack.peek()){
                minIntStack.push(val);
            }
        }
    }
    
    public void pop() {
        System.out.println(minIntStack.peek() + " :: "+stack.peek());
        if((int)stack.peek() == (int)minIntStack.peek()){
            System.out.println("Popping from minimum stack : ");
            minIntStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minIntStack.peek();
    }
}
