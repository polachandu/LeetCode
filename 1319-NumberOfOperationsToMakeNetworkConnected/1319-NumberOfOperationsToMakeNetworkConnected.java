// Last updated: 9/26/2026, 12:56:01 PM
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (n > connections.length + 1) {
            return -1;
        }
        int count = 0;
        int[] parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < connections.length; i++) {
            if (find(parent, connections[i][0]) == find(parent, connections[i][1])) {
                count++;
            } else {
                union(parent, connections[i][0], connections[i][1]);
            }
        }

        Set<Integer> set = new HashSet();
        int numberOfComponents = 0;
        for (int i = 0; i < parent.length; i++) {
            int root = find(parent, i);
            if (!set.contains(root)) {
                numberOfComponents++;
            }
            set.add(root);
        }
        return count >= numberOfComponents - 1 ? numberOfComponents - 1 : -1;
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