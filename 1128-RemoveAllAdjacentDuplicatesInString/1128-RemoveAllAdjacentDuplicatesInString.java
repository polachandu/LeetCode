// Last updated: 8/12/2026, 11:11:52 AM
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == cur){
                stack.pop();
            }else{
                stack.push(cur);
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}