// Last updated: 11/25/2026, 5:46:13 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3        Map<String, String> map = new HashMap();
4        for (List<String> addMap : knowledge) {
5            map.put(addMap.get(0), addMap.get(1));
6        }
7        StringBuilder sb = new StringBuilder();
8        for (int i = 0; i < s.length(); i++) {
9            char ch = s.charAt(i);
10            if (ch == '(') {
11                int j = i + 1;
12                while (s.charAt(j) != ')') {
13                    j++;
14                }
15                String key = s.substring(i + 1, j);
16                sb.append(map.getOrDefault(key, "?"));
17                i = j;
18            } else {
19                sb.append(ch);
20            }
21        }
22        return sb.toString();
23    }
24}