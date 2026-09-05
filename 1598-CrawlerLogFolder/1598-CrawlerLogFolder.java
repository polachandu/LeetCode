// Last updated: 9/5/2026, 12:30:10 PM
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String s:logs){
            if(s.equals("../")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(s.equals("./")){
                continue;
            }else{
                stack.push(s);
            }
        }
        
      return stack.size();  
    }
}