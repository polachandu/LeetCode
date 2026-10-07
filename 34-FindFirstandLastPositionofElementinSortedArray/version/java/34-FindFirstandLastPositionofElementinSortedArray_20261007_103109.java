// Last updated: 10/7/2026, 10:31:09 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = search(nums, target, true);
4        int last = search(nums, target, false);
5        int[] result = new int[] { first, last };
6        return result;
7    }
8
9    private int search(int[] nums, int target, boolean findFirst) {
10        if (nums.length == 0)
11            return -1;
12        int left = 0, right = nums.length - 1;
13        while (left < right) {
14            if (findFirst) {
15                int mid = left + (right - left) / 2;
16                if (nums[mid] >= target) {
17                    right = mid;
18                } else {
19                    left = mid + 1;
20                }
21            } else {
22                int mid = left + ((right - left + 1) / 2);
23                if (nums[mid] <= target) {
24                    left = mid;
25                } else {
26                    right = mid - 1;
27                }
28            }
29        }
30        return nums[left] == target ? left : -1;
31    }
32
33}