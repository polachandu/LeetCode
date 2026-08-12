// Last updated: 8/12/2026, 11:19:51 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<target) {
				count++;
			}
			}
		
		
		
		
	return count;
    }
}