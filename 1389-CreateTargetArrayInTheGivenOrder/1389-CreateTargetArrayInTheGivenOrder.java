// Last updated: 9/5/2026, 12:30:52 PM
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