// Last updated: 8/12/2026, 11:08:51 AM
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