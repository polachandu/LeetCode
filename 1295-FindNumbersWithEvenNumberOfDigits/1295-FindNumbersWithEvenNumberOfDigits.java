// Last updated: 9/5/2026, 12:31:12 PM
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