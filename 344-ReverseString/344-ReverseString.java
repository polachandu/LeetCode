// Last updated: 8/12/2026, 11:15:14 AM
class Solution {
    public void reverseString(char[] s) {
        int stringLength = s.length;
        char[] res = new char[stringLength];
        for(int i=0;i<stringLength;i++){
            res[i] = s[stringLength-i-1];
        }
        for(int i=0;i<stringLength;i++){
            s[i] = res[i];
        }

    }
}