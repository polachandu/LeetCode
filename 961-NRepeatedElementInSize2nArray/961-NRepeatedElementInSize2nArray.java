// Last updated: 9/5/2026, 12:32:10 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
	        	for(int j=0;j<nums.length&&j != i;j++) {
	        		if(nums[i]==nums[j]) {
                        return nums[i];
                    }
	        	}
	        }
	        return 0;
    }
}