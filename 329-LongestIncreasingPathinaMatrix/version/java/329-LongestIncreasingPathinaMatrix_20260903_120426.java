// Last updated: 9/3/2026, 12:04:26 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length(), n = text2.length();
4        int[][] dp = new int[m + 1][n + 1];
5        for (int i = 0; i < m; i++) {
6            dp[i][0] = 0;
7        }
8        for (int i = 0; i < n; i++) {
9            dp[0][i] = 0;
10        }
11        for (int i = 1; i <= m; i++) {
12            for (int j = 1; j <= n; j++) {
13                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
14                    dp[i][j] = dp[i - 1][j - 1] + 1;
15                } else {
16                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
17                }
18            }
19        }
20        return dp[m][n];
21    }
22}