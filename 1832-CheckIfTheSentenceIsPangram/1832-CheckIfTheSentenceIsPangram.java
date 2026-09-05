// Last updated: 9/5/2026, 12:29:09 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alpha.length();i++){
            if(sentence.indexOf(alpha.charAt(i))==-1){
                return false;
            }
        }return true; 
    }
}