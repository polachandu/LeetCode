class Solution {
    public String longestPalindrome(String s) {
        for(int length=s.length();length>0;length--){
            for(int start=0;start<=s.length()-length;start++){
                if(check(start,start+length,s)){
                    return s.substring(start,start+length);
                }
            }
        }
        return "";
    }

    private boolean check(int start, int end, String s){
        int i = start;
        int j = end-1;
        while(i<j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
            i++;
            j--;
        }
        return true;
    }

}