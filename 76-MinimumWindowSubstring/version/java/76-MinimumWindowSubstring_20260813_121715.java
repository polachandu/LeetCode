// Last updated: 8/13/2026, 12:17:15 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
4            return "";
5        }
6        Map<Character, Integer> need = new HashMap();
7        for (char ch : t.toCharArray()) {
8            need.put(ch, need.getOrDefault(ch, 0) + 1);
9        }
10
11        Map<Character, Integer> window = new HashMap();
12        int left = 0, right = 0;
13        int minLen = Integer.MAX_VALUE, minLeft = 0;
14        int required = need.size();
15        int formed = 0;
16        while (right < s.length()) {
17            char rightChar = s.charAt(right);
18            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);
19
20            if (need.containsKey(rightChar) && window.get(rightChar).equals(need.get(rightChar))) {
21                formed++;
22            }
23
24            while (required == formed && left <= right) {
25                if (right - left + 1 < minLen) {
26                    minLen = right - left + 1;
27                    minLeft = left;
28                }
29                char leftChar = s.charAt(left);
30                window.put(leftChar, window.get(leftChar) - 1);
31
32                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
33                    formed--;
34                }
35                left++;
36            }
37            right++;
38        }
39        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLen + minLeft);
40    }
41}