// Last updated: 8/12/2026, 11:17:34 AM
class Solution {
    public int singleNumber(int[] nums) {
          
		 int num=0;
		 for(int i=0;i<nums.length;i++) {
				int j;
				for(j=0;j<nums.length;j++) {
					if(nums[i]==nums[j]&&i!=j) {
						break;
					}
				}if(j==nums.length) {
					num= nums[i];
					
				}
			}
			return num;
    }
}
