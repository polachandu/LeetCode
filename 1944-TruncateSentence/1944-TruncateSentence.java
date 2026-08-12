// Last updated: 8/12/2026, 11:08:56 AM
class Solution {
    public String truncateSentence(String s, int k) {
        int count =0;
		int i=0;
	        for(i=0;i<s.length();i++) {
	        	if(Character.isWhitespace(s.charAt(i))) {
	        		count++;
	        	}
	        	if(count==k) {
	        		break;
	        	}
	        }
	        return s.substring(0, i);
    }
}