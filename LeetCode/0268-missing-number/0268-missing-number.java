class Solution {
    public int missingNumber(int[] nums) {
        int xoredValue = 0;
        int numsXoredValue = 0;
        for (int i = 0; i < nums.length; i++) {
            xoredValue ^= i;
            numsXoredValue ^= nums[i];
        }
        return (xoredValue ^ (nums.length)) ^ numsXoredValue;
    }
}