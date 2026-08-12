// Last updated: 8/12/2026, 11:30:29 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if (s.length() == 1)
4            return 1;
5        int left = 0, right = 0;
6        int maxLen = 0;
7        Map<Character, Integer> map = new HashMap();
8        while (right < s.length()) {
9            if (!map.containsKey(s.charAt(right))) {
10                map.put(s.charAt(right), right);
11            } else {
12                left = Math.max(left, map.get(s.charAt(right)) + 1);
13                map.put(s.charAt(right), right);
14            }
15            maxLen = Math.max(maxLen, right - left + 1);
16            right++;
17        }
18        return maxLen;
19    }
20}