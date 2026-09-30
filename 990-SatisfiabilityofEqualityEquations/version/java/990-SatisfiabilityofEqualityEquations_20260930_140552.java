// Last updated: 9/30/2026, 2:05:52 PM
1class Solution {
2    public boolean equationsPossible(String[] equations) {
3        int[] parent = new int[26];
4        for (int i = 0; i < parent.length; i++) {
5            parent[i] = i;
6        }
7        for (String equation : equations) {
8            if (equation.charAt(1) == '=') {
9                union(parent, equation.charAt(0) - 'a', equation.charAt(3) - 'a');
10            }
11        }
12        for (String equation : equations) {
13            if (equation.charAt(1) == '!') {
14                if (find(parent, parent[equation.charAt(0) - 'a']) == find(parent, parent[equation.charAt(3) - 'a'])) {
15                    return false;
16                }
17            }
18        }
19        return true;
20    }
21
22    private int find(int[] parent, int x) {
23        if (parent[x] != x) {
24            parent[x] = find(parent, parent[x]);
25        }
26        return parent[x];
27    }
28
29    private void union(int[] parent, int x, int y) {
30        int rootX = find(parent, x);
31        int rootY = find(parent, y);
32        if (rootX != rootY) {
33            parent[rootX] = rootY;
34        }
35    }
36}