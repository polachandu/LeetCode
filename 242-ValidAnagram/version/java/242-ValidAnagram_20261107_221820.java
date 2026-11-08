// Last updated: 11/7/2026, 10:18:20 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length())
4            return false;
5        HashMap<Character, Integer> sMap = new HashMap();
6        for (int i = 0; i < s.length(); i++) {
7            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
8        }
9        for (int i = 0; i < t.length(); i++) {
10            char tChar = t.charAt(i);
11            if (!sMap.containsKey(tChar) || sMap.get(tChar) == 0) {
12                return false;
13            }
14            sMap.put(tChar, sMap.getOrDefault(tChar, 0) - 1);
15        }
16        return true;
17    }
18}