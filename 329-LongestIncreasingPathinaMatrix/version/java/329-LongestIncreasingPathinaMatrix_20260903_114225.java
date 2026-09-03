// Last updated: 9/3/2026, 11:42:25 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int len1 = text1.length();
4        int len2 = text2.length();
5        int[][] dp = new int[len1 + 1][len2 + 1];
6        for (int i = 0; i <= len1; i++) {
7            dp[i][0] = 0;
8        }
9        for (int i = 0; i <= len2; i++) {
10            dp[0][i] = 0;
11        }
12        for (int i = 1; i <= len1; i++) {
13            for (int j = 1; j <= len2; j++) {
14                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
15                    dp[i][j] = dp[i - 1][j - 1] + 1;
16                } else {
17                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
18                }
19            }
20        }
21        return dp[len1][len2];
22    }
23}