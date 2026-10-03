// Last updated: 10/2/2026, 9:38:22 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> map = new HashMap();
4        for (int i = 0; i < nums.length; i++) {
5            map.put(nums[i], i);
6        }
7        for (int i = 0; i < nums.length; i++) {
8            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
9                return new int[] { i, map.get(target - nums[i]) };
10            }
11        }
12        return new int[] { -1, -1 };
13    }
14}