// Last updated: 10/8/2026, 1:00:52 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap();
4        List<List<String>> results = new ArrayList();
5        for (String s : strs) {
6            char[] chArray = s.toCharArray();
7            Arrays.sort(chArray);
8            map.putIfAbsent(String.valueOf(chArray), new ArrayList());
9            map.get(String.valueOf(chArray)).add(s);
10        }
11        for (List<String> mapValues : map.values()) {
12            results.add(mapValues);
13        }
14        return results;
15    }
16}