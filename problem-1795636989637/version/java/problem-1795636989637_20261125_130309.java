// Last updated: 11/25/2026, 1:03:09 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        Map<Character, Character> sToTMap = new HashMap();
7        Map<Character, Character> tToSMap = new HashMap();
8        for (int i = 0; i < s.length(); i++) {
9            if (sToTMap.containsKey(s.charAt(i))) {
10                if (t.charAt(i) != sToTMap.get(s.charAt(i))) {
11                    return false;
12                }
13            } else {
14                sToTMap.put(s.charAt(i), t.charAt(i));
15            }
16        }
17        for (int i = 0; i < t.length(); i++) {
18            if (tToSMap.containsKey(t.charAt(i))) {
19                if (s.charAt(i) != tToSMap.get(t.charAt(i))) {
20                    return false;
21                }
22            } else {
23                tToSMap.put(t.charAt(i), s.charAt(i));
24            }
25        }
26        return true;
27    }
28}