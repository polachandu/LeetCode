// Last updated: 10/7/2026, 10:24:46 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findFirst(nums, target);
4        int last = findLast(nums, target);
5        int[] result = new int[] { first, last };
6        return result;
7    }
8
9    private int findFirst(int[] nums, int target) {
10        if (nums.length == 0)
11            return -1;
12        int left = 0, right = nums.length - 1;
13        while (left < right) {
14            int mid = left + ((right - left) / 2);
15
16            if (nums[mid] >= target) {
17                right = mid;
18            } else {
19                left = mid + 1;
20            }
21        }
22        return nums[left] == target ? left : -1;
23    }
24
25    private int findLast(int[] nums, int target) {
26        if (nums.length == 0)
27            return -1;
28
29        int left = 0, right = nums.length - 1;
30        while (left < right) {
31            int mid = left + ((right - left + 1) / 2);
32
33            if (nums[mid] <= target) {
34                left = mid;
35            } else {
36                right = mid - 1;
37            }
38        }
39        return nums[left] == target ? left : -1;
40    }
41}