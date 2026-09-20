// Last updated: 9/19/2026, 6:22:59 PM
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3        int[] parent = new int[edges.length + 1];
4        for (int i = 0; i < parent.length; i++) {
5            parent[i] = i;
6        }
7        for (int[] edge : edges) {
8            if (find(parent, (edge[0])) == find(parent, (edge[1]))) {
9                return new int[] { edge[0], edge[1] };
10            } else {
11                union(parent, edge[0], edge[1]);
12            }
13        }
14        return new int[] {};
15    }
16
17    private int find(int[] parent, int x) {
18        if (parent[x] != x) {
19            parent[x] = find(parent, parent[x]);
20        }
21        return parent[x];
22    }
23
24    private void union(int[] parent, int x, int y) {
25        int rootX = find(parent, x);
26        int rootY = find(parent, y);
27        if (rootX != rootY) {
28            parent[rootX] = rootY;
29        }
30    }
31}