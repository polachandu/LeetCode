// Last updated: 8/12/2026, 11:10:00 AM
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