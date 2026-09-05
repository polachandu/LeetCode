// Last updated: 9/5/2026, 12:31:00 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countNums = new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	        	int count =0;
	        	for(int j=0;j<nums.length;j++) {
	        		if(nums[j]<nums[i] && j != i) {
	        			count++;
	        		}
	        	}
	        	countNums[i] = count;
	        }
	        return countNums;
    }
}