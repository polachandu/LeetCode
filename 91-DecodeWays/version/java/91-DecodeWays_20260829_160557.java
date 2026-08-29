// Last updated: 8/29/2026, 4:05:57 PM
1class Solution {
2    public int numDecodings(String s) {
3        int[] dp = new int[s.length() + 1];
4        dp[0] = 1;
5        dp[1] = s.charAt(0) == '0' ? 0 : 1;
6        for (int i = 2; i <= s.length(); i++) {
7            if (Integer.parseInt(String.valueOf(s.charAt(i - 1))) >= 1
8                    && Integer.parseInt(String.valueOf(s.charAt(i - 1))) <= 9) {
9                dp[i] += dp[i - 1];
10            }
11            if (Integer.parseInt(s.substring(i - 2, i)) >= 10 && Integer.parseInt(s.substring(i - 2, i)) <= 26) {
12                dp[i] += dp[i - 2];
13            }
14        }
15        return dp[s.length()];
16    }
17}