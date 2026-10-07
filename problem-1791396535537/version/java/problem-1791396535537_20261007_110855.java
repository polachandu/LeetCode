// Last updated: 10/7/2026, 11:08:55 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        int result = 0;
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            if (nums[mid] < nums[mid + 1]) {
8                left = mid + 1;
9            } else {
10                right = mid;
11            }
12        }
13        return left;
14    }
15}