// Last updated: 8/24/2026, 3:22:40 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp, 1);
5        for (int i = 0; i < nums.length; i++) {
6            int j = 0;
7            while (j < i) {
8                if (nums[i] > nums[j]) {
9                    dp[i] = Math.max(dp[i], dp[j] + 1);
10                }
11                j++;
12            }
13        }
14        int longest = 0;
15        for (int val : dp) {
16            longest = Math.max(longest, val);
17        }
18        return longest;
19    }
20}