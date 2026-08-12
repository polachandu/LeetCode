// Last updated: 8/12/2026, 11:09:16 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int resLength = word1.length()+word2.length();
        int word1Counter=0, word2Counter=0;
        for(int i=0;i<resLength;i++){
        if(word1.length() > word1Counter){
            res.append(word1.charAt(i));
            word1Counter++;
        }
        if(word2.length() > word2Counter){
            res.append(word2.charAt(i));
            word2Counter++;
        }
        }
        System.gc();
        return res.toString();
    }
}