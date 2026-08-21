// Last updated: 8/20/2026, 6:40:44 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for (int i = 0; i < nums.length; i++) {
5            result ^= nums[i];
6        }
7        return result;
8    }
9}