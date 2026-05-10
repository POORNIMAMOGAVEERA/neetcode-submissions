class MinStack {
    Stack<Integer> stack;
    Stack<Integer> tempMin;
    public MinStack() {
        stack = new Stack<>();
        tempMin = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(tempMin.isEmpty()){
          tempMin.push(val);
        }else{
          tempMin.push(Math.min(val,tempMin.peek()));
        }
    }
    
    public void pop() {
        tempMin.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return tempMin.peek();
    }
}
