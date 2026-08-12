// Last updated: 8/12/2026, 11:12:02 AM
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