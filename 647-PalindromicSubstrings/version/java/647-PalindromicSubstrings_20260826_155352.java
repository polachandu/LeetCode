// Last updated: 8/26/2026, 3:53:52 PM
1class Solution {
2    public int countSubstrings(String s) {
3        int count = 0;
4        for (int i = 0; i < s.length(); i++) {
5            count += expand(s, i, i);
6            count += expand(s, i, i + 1);
7        }
8        return count;
9    }
10
11    private int expand(String s, int left, int right) {
12        int intCount = 0;
13        while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
14            left--;
15            right++;
16            intCount++;
17        }
18        return intCount;
19    }
20}