// Last updated: 8/12/2026, 11:09:56 AM
class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int count =0;
        Stack stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
                count++;
                if(count>max){
                    max = count;
                }
            }if(s.charAt(i)==')'){
                stack.pop();
                count--;
            }
        }
        return max;
    }
}