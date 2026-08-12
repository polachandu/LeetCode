// Last updated: 8/12/2026, 11:10:45 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List al = new ArrayList<>();
	        for(int i=0;i<index.length;i++) {
	        	al.add(index[i], nums[i]);
	        }
	        int[] targetArray = new int[al.size()];
	        for(int i=0;i<al.size();i++) {
	        	targetArray[i] = (int) al.get(i);
	        }
	        return targetArray;
    }
}