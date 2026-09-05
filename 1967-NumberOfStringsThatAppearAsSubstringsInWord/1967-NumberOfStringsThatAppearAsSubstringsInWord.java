// Last updated: 9/5/2026, 12:28:54 PM
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