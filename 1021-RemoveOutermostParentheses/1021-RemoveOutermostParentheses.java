// Last updated: 9/5/2026, 12:31:55 PM
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        Stack stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
                count++;
                if(count>1){
                    sb.append("(");
                }
            }if(s.charAt(i)==')'){
                stack.pop();
                count--;
                if(count>0){
                    sb.append(")");
                }
            }
        }
        return sb.toString();
    }
}