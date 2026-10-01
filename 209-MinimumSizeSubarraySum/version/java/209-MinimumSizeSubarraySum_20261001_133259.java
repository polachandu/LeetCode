// Last updated: 10/1/2026, 1:32:59 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int minCount = Integer.MAX_VALUE;
4        int left = 0;
5        int sum = 0;
6        int leftSum = 0;
7        for (int right = 0; right < nums.length; right++) {
8
9            sum += nums[right];
10
11            while (sum >= target) {
12                sum -= nums[left];
13                minCount = Math.min(minCount, right - left + 1);
14                left++;
15            }
16        }
17        return minCount == Integer.MAX_VALUE ? 0 : minCount;
18    }
19}