// Last updated: 9/5/2026, 12:31:29 PM
class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
		int bal =0;
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i)=='R') {
	        		bal++;
	        	}else {
	        		bal--;
	        	}
	        	if(bal==0) {
	        		count++;
	        	}
	        }
	        return count;
    }
}