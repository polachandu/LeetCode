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