// Last updated: 9/5/2026, 12:29:20 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        if((int)coordinates.charAt(0)%2 != 0 && coordinates.charAt(1)%2 != 0) {
	        	return false;
	        }else if((int)coordinates.charAt(0)%2 == 0 && coordinates.charAt(1)%2 != 0) {
	        	return true;
	        }else if((int)coordinates.charAt(0)%2 != 0 && coordinates.charAt(1)%2 == 0) {
	        	return true;
	        }else {
	        	return false;
	        }
    }
}