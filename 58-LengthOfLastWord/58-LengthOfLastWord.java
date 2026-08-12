// Last updated: 8/12/2026, 11:19:11 AM
class Solution {
    public int lengthOfLastWord(String s) {
         int count = 0;
		        if (s == null || s.length()==0) {
		            return 0;
		        }
		        String[] words = s.split("\\s+");
		        if (words.length >= 1) {
		            for (int i = 0; i < words[words.length - 1].length(); i++) {
		                count++;
		            }
		        }
		        return count;
		    }
}
    
