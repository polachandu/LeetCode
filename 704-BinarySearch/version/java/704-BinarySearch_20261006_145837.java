// Last updated: 10/6/2026, 2:58:37 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + ((right - left) / 2);
7            if (nums[mid] == target) {
8                return mid;
9            }
10            if (nums[mid] <= target) {
11                left = mid + 1;
12            } else {
13                right = mid - 1;
14            }
15        }
16        return -1;
17    }
18}