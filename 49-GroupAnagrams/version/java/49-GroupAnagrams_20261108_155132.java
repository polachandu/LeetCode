// Last updated: 11/8/2026, 3:51:32 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap();
4        List<List<String>> results = new ArrayList();
5
6        for (String str : strs) {
7            char[] strArray = str.toCharArray();
8            Arrays.sort(strArray);
9            String sortedString = new String(strArray);
10            map.computeIfAbsent(sortedString, k -> new ArrayList()).add(str);
11        }
12        for (List<String> string : map.values()) {
13            results.add(string);
14        }
15        return results;
16
17    }
18}