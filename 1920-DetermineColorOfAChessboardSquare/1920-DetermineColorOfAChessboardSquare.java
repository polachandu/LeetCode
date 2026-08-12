// Last updated: 8/12/2026, 11:09:04 AM
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