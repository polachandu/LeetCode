// Last updated: 9/28/2026, 8:49:42 PM
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            if (find(parent, (edge[0])) == find(parent, (edge[1]))) {
                return new int[] { edge[0], edge[1] };
            } else {
                union(parent, edge[0], edge[1]);
            }
        }
        return new int[] {};
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    private void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if (rootX != rootY) {
            parent[rootX] = rootY;
        }
    }
}