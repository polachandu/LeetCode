// Last updated: 8/12/2026, 11:10:07 AM
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