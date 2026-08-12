// Last updated: 8/12/2026, 11:14:34 AM
class Solution {
    public int compress(char[] chars) {
        int i=0, res=0;
        while(i < chars.length){
            int groupLength = 1;
            while(i+groupLength < chars.length && chars[i+groupLength] == chars[i]){
                groupLength++;
            }
             chars[res++] = chars[i];
            if(groupLength > 1){
                for(char c : Integer.toString(groupLength).toCharArray()){
                    chars[res++] = c;
                }
            }
            i+=groupLength;
        }
        return res;
    }
}