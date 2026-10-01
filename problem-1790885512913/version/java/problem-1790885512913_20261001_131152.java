// Last updated: 10/1/2026, 1:11:52 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxLength = 0;
4        int left = 0;
5        Map<Character, Integer> map = new HashMap();
6
7        for (int right = 0; right < s.length(); right++) {
8            if (map.containsKey(s.charAt(right))) {
9                left = Math.max(map.get(s.charAt(right)) + 1, left);
10            }
11            map.put(s.charAt(right), right);
12            maxLength = Math.max(maxLength, right - left + 1);
13        }
14
15        return maxLength;
16    }
17}