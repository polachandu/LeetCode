// Last updated: 10/6/2026, 3:29:50 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        while (left <= right) {
5            int mid = left + ((right - left) / 2);
6            if (nums[mid] == target) {
7                return mid;
8            } else {
9                if (nums[mid] < target) {
10                    left = mid + 1;
11                } else {
12                    right = mid - 1;
13                }
14            }
15        }
16        return left;
17    }
18}