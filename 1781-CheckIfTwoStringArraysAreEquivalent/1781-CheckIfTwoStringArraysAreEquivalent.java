// Last updated: 8/12/2026, 11:09:48 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder combinedWord1 = new StringBuilder();
        StringBuilder combinedWord2 = new StringBuilder();
        for(int i=0;i<word1.length;i++){
            combinedWord1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            combinedWord2.append(word2[i]);
        }
        String newCombinedWord1 = combinedWord1.toString();
        String newCombinedWord2 = combinedWord2.toString();
        if(newCombinedWord1.equals(newCombinedWord2)){
            return true;
        }else{
            return false;
        }
    }
}