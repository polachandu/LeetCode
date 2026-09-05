// Last updated: 9/5/2026, 12:32:23 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList list1 = new ArrayList<>();
		ArrayList list2 = new ArrayList<>();
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]%2 ==0) {
	        		list1.add(nums[i]);
	        	}
	        }
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]%2 !=0) {
	        		list2.add(nums[i]);
	        	}
	        }
	        list1.addAll(list2);
	        int[] newNums = new int[nums.length];
	        for(int i=0;i<list1.size();i++) {
	        	newNums[i] = (int) list1.get(i);
	        }
	        
	       return newNums; 
    }
}