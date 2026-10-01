// Last updated: 10/1/2026, 11:35:22 AM
1class Solution {
2    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
3        int[] parent = new int[s.length()];
4        for (int i = 0; i < parent.length; i++) {
5            parent[i] = i;
6        }
7
8        for (List<Integer> pair : pairs) {
9            union(parent, pair.get(0), pair.get(1));
10        }
11        Map<Integer, List<Integer>> map = new HashMap();
12        for (int i = 0; i < parent.length; i++) {
13            int root = find(parent, i);
14            map.putIfAbsent(root, new ArrayList());
15            map.get(root).add(i);
16        }
17        char[] result = new char[s.length()];
18
19        for (List<Integer> indices : map.values()) {
20            List<Character> chars = new ArrayList<>();
21            for (int idx : indices) {
22                chars.add(s.charAt(idx));
23            }
24
25            Collections.sort(indices);
26            Collections.sort(chars);
27
28            for (int i = 0; i < indices.size(); i++) {
29                result[indices.get(i)] = chars.get(i);
30            }
31        }
32
33        return new String(result);
34
35    }
36
37    private int find(int[] parent, int x) {
38        if (parent[x] != x) {
39            parent[x] = find(parent, parent[x]);
40        }
41        return parent[x];
42    }
43
44    private void union(int[] parent, int x, int y) {
45        int rootX = find(parent, x);
46        int rootY = find(parent, y);
47        if (rootX != rootY) {
48            parent[rootX] = rootY;
49        }
50    }
51}