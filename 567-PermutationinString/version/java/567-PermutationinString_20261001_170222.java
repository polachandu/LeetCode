// Last updated: 10/1/2026, 5:02:22 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        boolean result = false;
4        Map<Character, Integer> map1 = new HashMap();
5        for (char ch1 : s1.toCharArray()) {
6            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
7        }
8        int windowSize = s1.length();
9        for (int right = 0; right < s2.length() - windowSize + 1; right++) {
10            String subString = s2.substring(right, right + windowSize);
11            Map<Character, Integer> map2 = new HashMap();
12            for (int i = 0; i < subString.length(); i++) {
13                map2.put(subString.charAt(i), map2.getOrDefault(subString.charAt(i), 0) + 1);
14            }
15            if (map1.equals(map2)) {
16                result = true;
17            }
18        }
19        return result;
20    }
21}