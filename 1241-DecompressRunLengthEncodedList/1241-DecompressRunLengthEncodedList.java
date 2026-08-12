// Last updated: 8/12/2026, 11:11:41 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList al = new ArrayList<>();
	        int n = nums.length;
	        for(int i=0;i<n;i+=2) {
	        	for(int j=0;j <nums[i];j++) {
	        		al.add(nums[i+1]);
	        	}
	        }
	        int[] newNums = new int[al.size()];
	        for(int i=0;i<al.size();i++) {
	        	newNums[i] = (int) al.get(i);
	        }
	        return newNums;
    }
}