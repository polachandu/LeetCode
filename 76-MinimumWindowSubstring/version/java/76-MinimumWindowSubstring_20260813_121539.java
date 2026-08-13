// Last updated: 8/13/2026, 12:15:39 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s == null || t == null || s.length() < t.length())
4            return "";
5
6        Map<Character, Integer> need = new HashMap();
7        for (char ch : t.toCharArray()) {
8            need.put(ch, need.getOrDefault(ch, 0) + 1);
9        }
10
11        Map<Character, Integer> window = new HashMap();
12        int left = 0, right = 0;
13        int required = need.size(), formed = 0;
14        int minLen = Integer.MAX_VALUE, minLeft = 0;
15        while (right < s.length()) {
16            char c = s.charAt(right);
17            window.put(c, window.getOrDefault(c, 0) + 1);
18
19            if (need.containsKey(c) && window.get(c).equals(need.get(c))) {
20                formed++;
21            }
22
23            while (formed == required && left <= right) {
24                if (right - left + 1 < minLen) {
25                    minLen = right - left + 1;
26                    minLeft = left;
27                }
28
29                char leftChar = s.charAt(left);
30                window.put(leftChar, window.getOrDefault(leftChar, 0) - 1);
31                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
32                    formed--;
33                }
34                left++;
35            }
36            right++;
37        }
38        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
39    }
40}