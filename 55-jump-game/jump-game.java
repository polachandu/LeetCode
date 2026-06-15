class Solution {
    public boolean canJump(int[] nums) {
        int canJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > canJump) {
                return false;
            }
            canJump = Math.max(canJump, i + nums[i]);
        }
        return true;
    }
}