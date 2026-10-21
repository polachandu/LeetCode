// Last updated: 10/20/2026, 7:29:33 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Map<Character, Integer> map = new HashMap();
4        int left = 0;
5        int maxLen = 0;
6        for (int right = 0; right < s.length(); right++) {
7            char ch = s.charAt(right);
8            if (!map.containsKey(ch)) {
9                map.put(ch, right);
10            } else {
11                left = Math.max(left, map.get(ch) + 1);
12                map.put(ch, right);
13            }
14            maxLen = Math.max(maxLen, right - left + 1);
15        }
16        return maxLen;
17    }
18}