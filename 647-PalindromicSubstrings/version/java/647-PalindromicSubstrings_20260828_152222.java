// Last updated: 8/28/2026, 3:22:22 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap();
4        for (String s : strs) {
5            char[] chars = s.toCharArray();
6            Arrays.sort(chars);
7            String key = new String(chars);
8            map.putIfAbsent(key, new ArrayList());
9            map.get(key).add(s);
10        }
11        return new ArrayList(map.values());
12    }
13}