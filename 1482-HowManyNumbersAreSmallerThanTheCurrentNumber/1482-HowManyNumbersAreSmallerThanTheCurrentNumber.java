// Last updated: 8/12/2026, 11:10:56 AM
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