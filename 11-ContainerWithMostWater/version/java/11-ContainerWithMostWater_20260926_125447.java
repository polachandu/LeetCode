// Last updated: 9/26/2026, 12:54:47 PM
1class Solution {
2    public int makeConnected(int n, int[][] connections) {
3        if (n > connections.length + 1) {
4            return -1;
5        }
6        int count = 0;
7        int[] parent = new int[n];
8        for (int i = 0; i < parent.length; i++) {
9            parent[i] = i;
10        }
11
12        for (int i = 0; i < connections.length; i++) {
13            if (find(parent, connections[i][0]) == find(parent, connections[i][1])) {
14                count++;
15            } else {
16                union(parent, connections[i][0], connections[i][1]);
17            }
18        }
19
20        Set<Integer> set = new HashSet();
21        int numberOfComponents = 0;
22        for (int i = 0; i < parent.length; i++) {
23            int root = find(parent, i);
24            if (!set.contains(root)) {
25                numberOfComponents++;
26            }
27            set.add(root);
28        }
29        return count >= numberOfComponents - 1 ? numberOfComponents - 1 : -1;
30    }
31
32    private int find(int[] parent, int x) {
33        if (parent[x] != x) {
34            parent[x] = find(parent, parent[x]);
35        }
36        return parent[x];
37    }
38
39    private void union(int[] parent, int x, int y) {
40        int rootX = find(parent, x);
41        int rootY = find(parent, y);
42        if (rootX != rootY) {
43            parent[rootX] = rootY;
44        }
45    }
46}