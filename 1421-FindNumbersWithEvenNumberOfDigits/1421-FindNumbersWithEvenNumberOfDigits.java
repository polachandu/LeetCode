// Last updated: 8/12/2026, 11:11:11 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
	        for(int i=0;i<nums.length;i++) {
	        	String a = Integer.toString(nums[i]);
	        	if(a.length()%2 == 0) {
	        		count++;
	        	}
	        }
	        return count;
    }
}