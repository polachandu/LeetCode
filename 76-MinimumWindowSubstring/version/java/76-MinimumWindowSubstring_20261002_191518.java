// Last updated: 10/2/2026, 7:15:18 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
5            return "";
6        }
7        Map<Character, Integer> need = new HashMap();
8        for (char ch : t.toCharArray()) {
9            need.put(ch, need.getOrDefault(ch, 0) + 1);
10        }
11        int left = 0;
12        int minLength = Integer.MAX_VALUE;
13        int formed = need.size();
14        int count = 0;
15        int minLeft = 0;
16        Map<Character, Integer> required = new HashMap();
17        for (int right = 0; right < s.length(); right++) {
18            required.put(s.charAt(right), required.getOrDefault(s.charAt(right), 0) + 1);
19            if (need.containsKey(s.charAt(right))
20                    && (need.get(s.charAt(right)).equals(required.get(s.charAt(right))))) {
21                count++;
22            }
23            while (formed == count) {
24                if (right - left + 1 < minLength) {
25                    minLength = right - left + 1;
26                    minLeft = left;
27                }
28                required.put(s.charAt(left), required.get(s.charAt(left)) - 1);
29                if (need.containsKey(s.charAt(left)) && (required.get(s.charAt(left)) < need.get(s.charAt(left)))) {
30                    count--;
31                }
32                left++;
33            }
34        }
35        minLength = (minLength == Integer.MAX_VALUE) ? 0 : minLength;
36        return s.substring(minLeft, minLeft + minLength);
37    }
38}