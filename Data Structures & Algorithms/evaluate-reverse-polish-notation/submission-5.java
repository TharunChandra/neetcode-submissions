class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if (s.equals("+")){
                Integer add = stack.pop() + stack.pop();
                stack.push(add);
            } else if (s.equals("*")) {
                Integer prod = stack.pop() * stack.pop();
                stack.push(prod);
            } else if (s.equals("-")) {
                Integer sub = stack.pop();
                sub = stack.pop() - sub;
                stack.push(sub);
            } else if (s.equals("/")) {
                Integer div = stack.pop();
                div = stack.pop() / div;
                stack.push(div);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
