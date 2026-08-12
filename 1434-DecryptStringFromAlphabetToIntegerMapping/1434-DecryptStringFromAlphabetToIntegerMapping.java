// Last updated: 8/12/2026, 11:11:03 AM
class Solution {
   Stack<Character> stack = new Stack<>();
     public String freqAlphabets(String s) {
         char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder();
        //insert into stack
        for(int i=0;i<ch.length;i++)
            stack.push(ch[i]);
        
        int val = 0;
        while(!stack.isEmpty()){
            StringBuilder sb = new StringBuilder();
            char c = stack.pop();
            if(c=='#'){
                //pop next two characters
                sb.append(stack.pop()).append(stack.pop());
                //form the integer value by reversing
                val = Integer.valueOf(sb.reverse().toString());
                //append to result string by character manipulation
                result.append((char)(val+96));
            }
            else{
                sb.append(c);
                //form integer value
                val = Integer.valueOf(sb.toString());
                //append to result string by character manipulation
                result.append((char)(val+96));
    }
}
        
      return result.reverse().toString();  
    }
}