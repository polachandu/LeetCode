class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i < s.length() + 1; i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i - 1))) >= 1
                    && Integer.parseInt(String.valueOf(s.charAt(i - 1))) <= 9) {
                dp[i] += dp[i - 1];
            }
            if (Integer.parseInt(s.substring(i - 2, i)) >= 10 && Integer.parseInt(s.substring(i - 2, i)) <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}