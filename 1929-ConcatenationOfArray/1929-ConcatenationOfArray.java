// Last updated: 9/5/2026, 12:28:57 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int resLen = nums.length*2;
        int[] res = new int[resLen];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
}