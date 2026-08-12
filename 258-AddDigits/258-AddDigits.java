// Last updated: 8/12/2026, 11:15:41 AM
class Solution {
    public int addDigits(int num) {
        if(num == 0) {
        	return 0;
        }else if(num%9 == 0) {
        	return 9;
        }else {
        	num = num%9;
        }
        return num;
    }
}