// Last updated: 10/7/2026, 11:29:05 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        while (left < right) {
5            int mid = left + (right - left) / 2;
6            if (nums[left] < nums[mid]) {
7                if (nums[mid] > nums[right]) {
8                    left = mid + 1;
9                } else {
10                    right = mid;
11                }
12            } else {
13                if (nums[mid] > nums[right]) {
14                    left = mid + 1;
15                } else {
16                    right = mid;
17                }
18            }
19        }
20        return nums[left];
21    }
22}