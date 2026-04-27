class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (isOperator(tokens[i])) {
                int a = stack.pop();
                int b = stack.pop();
                if (tokens[i].equals("+"))
                    stack.push(a + b);
                else if (tokens[i].equals("-"))
                    stack.push(b - a);
                else if (tokens[i].equals("*"))
                    stack.push(a * b);
                else
                    stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }

        }
        return stack.pop();
    }

    private boolean isOperator(String operand) {
        if (operand.equals("+") || operand.equals("-") || operand.equals("*") || operand.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

}