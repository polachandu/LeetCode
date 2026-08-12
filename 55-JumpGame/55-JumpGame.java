// Last updated: 8/12/2026, 11:19:17 AM
class Solution {
    public boolean canJump(int[] nums) {
        int canJump = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i > canJump) {
                return false;
            }
            canJump = Math.max(canJump, i + nums[i]);
        }
        return true;
    }
}