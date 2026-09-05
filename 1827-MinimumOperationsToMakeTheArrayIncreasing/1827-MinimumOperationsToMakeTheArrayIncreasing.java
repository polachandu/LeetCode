// Last updated: 9/5/2026, 12:29:16 PM
class Solution {
    public int minOperations(int[] nums) {
        int count =0;
	        for(int i=1;i<nums.length;i++) {
	        	while(nums[i]<=nums[i-1]) {
	        		nums[i]++;
	        		count++;
	        	}
	        	
	        }
	        //System.out.println(Arrays.toString(nums));
	        return count;
    }
}