class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < operations.length; i++) {
            if (!(operations[i].equals("C") || (operations[i].equals("D")) || (operations[i].equals("+")))) {
                stack.push(Integer.parseInt(operations[i]));
            }
            if (operations[i].equals("C")) {
                stack.pop();
            }
            if (operations[i].equals("D")) {
                int top = stack.pop();
                stack.push(top);
                stack.push(2 * top);
            }
            if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a + b);
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}