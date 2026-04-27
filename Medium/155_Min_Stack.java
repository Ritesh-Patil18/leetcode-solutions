class MinStack 
{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
   
    
    public void push(int val)
     {
        stack.push(val);
        if(minStack.isEmpty())
        {
            minStack.push(val);
        }
        else
        {
            int currentMin = Math.min(val,minStack.peek());
            minStack.push(currentMin);
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
       return stack.peek();
        
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
