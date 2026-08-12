// Last updated: 8/12/2026, 11:08:37 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
	        for(int i=0;i<patterns.length;i++) {
	        	if(word.contains(patterns[i])) {
	        		count++;
	        	}
	        }
	        return count;
    }
}