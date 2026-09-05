// Last updated: 9/5/2026, 12:32:18 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }else if(c==')' && st.size()>0 && st.peek()=='('){
                st.pop();
            }else{
                st.push(c);
            }
        }
        return st.size();
    }
}