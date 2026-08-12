// Last updated: 8/12/2026, 11:19:41 AM
class Solution {
    public int jump(int[] nums) {
        int hops = 0, farthest = 0, currentRange = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) {
                hops++;
                break;
            }

            if (i == currentRange) {
                hops++;
                currentRange = farthest;
            }
        }
        return hops;
    }
}