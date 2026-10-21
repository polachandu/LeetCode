// Last updated: 10/20/2026, 7:06:44 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> results = new ArrayList();
4        Map<String, List<String>> map = new HashMap();
5        for (String str : strs) {
6            char[] sorted = str.toCharArray();
7            Arrays.sort(sorted);
8            String sortedString = new String(sorted);
9            map.putIfAbsent(sortedString, new ArrayList());
10            map.get(sortedString).add(str);
11        }
12        for (List<String> values : map.values()) {
13            List<String> innerList = values;
14            results.add(innerList);
15        }
16        return results;
17    }
18}