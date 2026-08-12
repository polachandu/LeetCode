// Last updated: 8/12/2026, 11:31:34 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if (s.length() == 1)
4            return 1;
5        int left = 0, right = 0;
6        int maxLen = 0;
7        Map<Character, Integer> map = new HashMap();
8        while (right < s.length()) {
9            if (map.containsKey(s.charAt(right))) {
10                left = Math.max(left, map.get(s.charAt(right)) + 1);
11            }
12            map.put(s.charAt(right), right);
13            maxLen = Math.max(maxLen, right - left + 1);
14            right++;
15        }
16        return maxLen;
17    }
18}