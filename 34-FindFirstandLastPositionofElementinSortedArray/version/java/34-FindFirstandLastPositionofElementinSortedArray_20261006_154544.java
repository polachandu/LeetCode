// Last updated: 10/6/2026, 3:45:44 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findFirst(nums, target);
4        int last = findLast(nums, target);
5        return new int[] { first, last };
6    }
7
8    private int findFirst(int[] nums, int target) {
9        if (nums.length == 0)
10            return -1;
11        int left = 0, right = nums.length - 1;
12        while (left < right) {
13            int mid = left + (right - left) / 2;
14            if (nums[mid] >= target) {
15                right = mid;
16            } else {
17                left = mid + 1;
18            }
19        }
20        return nums[left] == target ? left : -1;
21    }
22
23    private int findLast(int[] nums, int target) {
24        if (nums.length == 0)
25            return -1;
26        int left = 0, right = nums.length - 1;
27        while (left < right) {
28            int mid = left + (right - left + 1) / 2;
29            if (nums[mid] <= target) {
30                left = mid;
31            } else {
32                right = mid - 1;
33            }
34        }
35        return nums[left] == target ? left : -1;
36    }
37}