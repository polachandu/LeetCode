// Last updated: 11/7/2026, 10:23:24 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        int[] check = new int[26];
7        for (int i = 0; i < s.length(); i++) {
8            check[s.charAt(i) - 'a']++;
9            check[t.charAt(i) - 'a']--;
10        }
11        for (int i = 0; i < 26; i++) {
12            if (check[i] != 0) {
13                return false;
14            }
15        }
16        return true;
17    }
18}