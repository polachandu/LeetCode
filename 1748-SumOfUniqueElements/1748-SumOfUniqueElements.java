// Last updated: 9/5/2026, 12:29:32 PM
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