class MinStack {
   private Stack<Integer> stack = null;
   private Stack<Integer> minStack;
   int min =-1;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        min = Math.min(val,min);
        stack.push(val);
    }
    
    public void pop() {
         if (stack.isEmpty()) return;
         int top = stack.pop();
         if (top == minStack.peek()) {
           minStack.pop();
         }
        stack.pop();
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
