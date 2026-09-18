// Last updated: 9/18/2026, 12:55:21 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        while (left <= right) {
5            int mid = left + (right - left) / 2;
6            if (nums[mid] == target) {
7                return mid;
8            }
9            if (nums[mid] > nums[right]) {
10                if (nums[left] <= target && target < nums[mid]) {
11                    right = mid - 1;
12                } else {
13                    left = mid + 1;
14                }
15            } else {
16                if (nums[right] >= target && target > nums[mid]) {
17                    left = mid + 1;
18                } else {
19                    right = mid - 1;
20                }
21            }
22        }
23        return -1;
24    }
25}