// Last updated: 9/5/2026, 12:29:13 PM
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