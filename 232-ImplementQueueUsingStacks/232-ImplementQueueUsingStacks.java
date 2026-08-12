// Last updated: 8/12/2026, 11:16:01 AM
class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;
    private int front;

    public MyQueue() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(st1.isEmpty()){
          front = x; 
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st2.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        int res = st1.pop();
        if(!st1.isEmpty()){
            front = st1.peek();
        }
        return res;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */