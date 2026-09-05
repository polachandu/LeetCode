// Last updated: 9/5/2026, 12:30:08 PM
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