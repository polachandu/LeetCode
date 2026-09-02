// Last updated: 9/2/2026, 11:18:12 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int m = s.length(), n = t.length();
4        int[][] dp = new int[m + 1][n + 1];
5        for (int i = 1; i <= n; i++) {
6            dp[0][i] = 0;
7        }
8        for (int j = 0; j <= m; j++) {
9            dp[j][0] = 1;
10        }
11        for (int i = 1; i <= m; i++) {
12            for (int j = 1; j <= n; j++) {
13                if (s.charAt(i - 1) == t.charAt(j - 1)) {
14                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
15                } else {
16                    dp[i][j] = dp[i - 1][j];
17                }
18            }
19        }
20        return dp[m][n];
21    }
22}