// Last updated: 8/12/2026, 11:15:40 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        List list = new ArrayList();
	 for(int i=0;i<nums.length;i++) {
			int j;
			for(j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]&&i!=j) {
					break;
				}
			}if(j==nums.length) {
				list.add(nums[i]);
				
			}
			
		}
	 int[] n = new int[list.size()];
	 for(int i=0;i<list.size();i++) {
		 n[i] = (int) list.get(i);
	 }
        return n;
    }
}