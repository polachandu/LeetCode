class Solution {
    public int numTilePossibilities(String tiles) {
        int[] charCount = new int[26];
        for(char c: tiles.toCharArray()){
            charCount[c-'A']++;
        } 
        return findSequences(charCount);
    }

    private int findSequences(int[] charCount){
        int totalCount = 0;

        for(int i=0;i<26;i++){
            if(charCount[i] == 0){
                continue;
            }
            totalCount++;
            charCount[i]--;
            totalCount += findSequences(charCount);
            charCount[i]++;
        }
        return totalCount;
    }
}