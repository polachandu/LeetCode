// Last updated: 10/7/2026, 3:12:54 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        Map<Character, Integer> map = new HashMap();
4        for (int i = 0; i < s.length(); i++) {
5            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
6        }
7        for (int i = 0; i < s.length(); i++) {
8            if (map.get(s.charAt(i)) == 1) {
9                return i;
10            }
11        }
12        return -1;
13    }
14}