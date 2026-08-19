// Last updated: 8/19/2026, 11:47:13 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet();
4        int duplicate = 0;
5        for (int i = 0; i < nums.length; i++) {
6            if (set.contains(nums[i])) {
7                duplicate = nums[i];
8                break;
9            }
10            set.add(nums[i]);
11        }
12        return duplicate;
13    }
14}