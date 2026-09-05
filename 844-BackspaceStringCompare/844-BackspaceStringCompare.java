// Last updated: 9/5/2026, 12:32:44 PM
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