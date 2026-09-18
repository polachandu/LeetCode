// Last updated: 9/18/2026, 11:37:38 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while (left < right) {
5            int mid = left + (right - left) / 2;
6            if (nums[mid] > nums[right]) {
7                left = mid + 1;
8            } else {
9                right = mid;
10            }
11        }
12        return nums[left];
13    }
14}