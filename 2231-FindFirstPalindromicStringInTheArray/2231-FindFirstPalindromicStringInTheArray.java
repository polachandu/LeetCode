// Last updated: 8/12/2026, 11:08:20 AM
class Solution {

    private boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(isPalindrome(s)){
                return s;
            }
        }
        return "";
    }
}