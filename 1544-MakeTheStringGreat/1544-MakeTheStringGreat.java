// Last updated: 9/5/2026, 12:30:15 PM
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char currChar: s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - currChar) == 32){
                stack.pop();
            }else{
                stack.push(currChar);
            }
        }

        StringBuilder res = new StringBuilder();
        for(char resChar:stack){
                res.append(resChar);
        }
        return res.toString();
    }
}