// Last updated: 10/1/2026, 5:16:39 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        boolean result = false;
4        Map<Character, Integer> map1 = new HashMap();
5        for (char ch1 : s1.toCharArray()) {
6            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
7        }
8        int windowSize = s1.length();
9        int left = 0;
10        Map<Character, Integer> map2 = new HashMap();
11        for (int right = 0; right < s2.length(); right++) {
12            if (right - left + 1 > windowSize) {
13                map2.put(s2.charAt(left), map2.get(s2.charAt(left)) - 1);
14                if (map2.get(s2.charAt(left)) == 0) {
15                    map2.remove(s2.charAt(left));
16                }
17                left++;
18            }
19            map2.put(s2.charAt(right), map2.getOrDefault(s2.charAt(right), 0) + 1);
20            if (map1.equals(map2)) {
21                result = true;
22                break;
23            }
24        }
25        return result;
26    }
27}