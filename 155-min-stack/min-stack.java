class MinStack {
    Stack<Integer>st;
    Stack<Integer>minst;
    public MinStack() {
       st=new Stack<>();
      minst=new Stack<>();
    }
    
    public void push(int value) {
       st.push(value);
       if(minst.isEmpty() || value<=minst.peek()){
        minst.push(value);
       }
    }
    
    public void pop() {
      int val=st.pop();
      if(val==minst.peek()){
        minst.pop();
      }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */