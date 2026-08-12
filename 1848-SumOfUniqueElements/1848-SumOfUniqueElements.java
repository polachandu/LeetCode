// Last updated: 8/12/2026, 11:09:17 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        int count[] = new int[101];
	        for(int i=0;i<nums.length;i++) {
	            count[nums[i]]++;
	        }
	        
	        int sum=0;
	        for(int i=1; i<count.length; i++) {
	            if(count[i]==1) {
	                sum += i;
	            }
	        }
	        return sum;
    }
}