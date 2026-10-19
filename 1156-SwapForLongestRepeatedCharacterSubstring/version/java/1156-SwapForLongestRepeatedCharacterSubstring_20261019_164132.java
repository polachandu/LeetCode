// Last updated: 10/19/2026, 4:41:32 PM
1class Solution {
2    public int maxRepOpt1(String text) {
3        int n = text.length();
4        int[] target = new int[26];
5        for (char ch : text.toCharArray()) {
6            target[ch - 'a']++;
7        }
8        int best = 0;
9        for (int c = 0; c < 26; c++) {
10            if (target[c] == 0)
11                continue;
12            int left = 0, bad = 0;
13            for (int right = 0; right < n; right++) {
14                if (text.charAt(right) - 'a' != c) {
15                    bad++;
16                }
17                while (bad > 1) {
18                    if (text.charAt(left) - 'a' != c) {
19                        bad--;
20                    }
21                    left++;
22                }
23                best = Math.max(best, Math.min(right - left + 1, target[c]));
24            }
25        }
26        return best;
27    }
28}