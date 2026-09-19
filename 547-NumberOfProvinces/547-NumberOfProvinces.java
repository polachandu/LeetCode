// Last updated: 9/19/2026, 2:07:20 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] parent = new int[isConnected.length];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 1) {
                    union(parent, i, j);
                }
            }
        }

        Set<Integer> set = new HashSet();
        int count = 0;
        for (int i = 0; i < parent.length; i++) {
            int root = find(parent, i);
            if (!set.contains(parent[i])) {
                count++;
            }
            set.add(parent[i]);
        }
        return count;
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