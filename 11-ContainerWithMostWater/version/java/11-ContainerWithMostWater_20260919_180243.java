// Last updated: 9/19/2026, 6:02:43 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int[] parent = new int[isConnected.length];
4        for (int i = 0; i < parent.length; i++) {
5            parent[i] = i;
6        }
7
8        for (int i = 0; i < isConnected.length; i++) {
9            for (int j = 0; j < isConnected[0].length; j++) {
10                if (isConnected[i][j] == 1) {
11                    union(parent, i, j);
12                }
13            }
14        }
15
16        Set<Integer> set = new HashSet();
17        int count = 0;
18        for (int i = 0; i < parent.length; i++) {
19            int root = find(parent, i);
20            if (!set.contains(root)) {
21                count++;
22            }
23            set.add(root);
24        }
25        return count;
26    }
27
28    private int find(int[] parent, int x) {
29        if (parent[x] != x) {
30            parent[x] = find(parent, parent[x]);
31        }
32        return parent[x];
33    }
34
35    private void union(int[] parent, int x, int y) {
36        int rootX = find(parent, x);
37        int rootY = find(parent, y);
38        if (rootX != rootY) {
39            parent[rootX] = rootY;
40        }
41    }
42}