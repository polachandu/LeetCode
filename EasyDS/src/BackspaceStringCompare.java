Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.
Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
  
  
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack stack1 = new Stack<>();
        Stack stack2 = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a =='#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }else{
                    stack1.push(a);
                }
            }
        
        for(int j=0;j<t.length();j++){
            char b = t.charAt(j);
            if(b == '#'){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }else{
                    stack2.push(b);
                }
            
    }
    while(!stack1.isEmpty()){
        s1.append(stack1.pop());
    }
    while(!stack2.isEmpty()){
        s2.append(stack2.pop());
    }
    if((s1.toString()).equals(s2.toString())){
        return true;
    }else{
        return false;
    }
}
}
