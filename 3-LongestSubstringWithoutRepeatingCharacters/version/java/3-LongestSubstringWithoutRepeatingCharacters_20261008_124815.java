// Last updated: 10/8/2026, 12:48:15 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if (s.length() == 0)
4            return 0;
5        int left = 0;
6        Map<Character, Integer> map = new HashMap();
7        int maxLen = Integer.MIN_VALUE;
8        for (int right = 0; right < s.length(); right++) {
9            if (!map.containsKey(s.charAt(right))) {
10                map.put(s.charAt(right), right);
11            } else {
12                left = Math.max(left, map.get(s.charAt(right)) + 1);
13                map.put(s.charAt(right), right);
14            }
15            maxLen = Math.max(maxLen, right - left + 1);
16        }
17        return maxLen;
18    }
19}