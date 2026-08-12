// Last updated: 8/12/2026, 11:17:07 AM
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            int minValue = minStack.peek();
            if (minValue < value) {
                minStack.push(minValue);
            } else {
                minStack.push(value);
            }
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */