// Last updated: 10/1/2026, 4:33:48 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int maxLength = 0;
4        int maxFreq = 0;
5        int left = 0;
6        Map<Character, Integer> map = new HashMap();
7        for (int right = 0; right < s.length(); right++) {
8            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
9            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
10            while (right - left + 1 - maxFreq > k) {
11                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
12                left++;
13            }
14            maxLength = Math.max(maxLength, right - left + 1);
15
16        }
17        return maxLength;
18    }
19}