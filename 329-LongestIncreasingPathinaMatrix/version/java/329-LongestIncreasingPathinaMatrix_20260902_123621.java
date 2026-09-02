// Last updated: 9/2/2026, 12:36:21 PM
1class Solution {
2    public int longestIncreasingPath(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4        int[][] memo = new int[m][n];
5        int maxPath = 0;
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                maxPath = Math.max(maxPath, dfs(matrix, i, j, memo));
9            }
10        }
11        return maxPath;
12    }
13
14    private int dfs(int[][] matrix, int row, int col, int[][] memo) {
15        if (memo[row][col] != 0)
16            return memo[row][col];
17
18        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
19        int maxPath = 1;
20        for (int[] dir : dirs) {
21            int nRow = dir[0] + row;
22            int nCol = dir[1] + col;
23            if (nRow >= 0 && nRow < matrix.length && nCol >= 0 && nCol < matrix[0].length
24                    && matrix[nRow][nCol] > matrix[row][col]) {
25                maxPath = Math.max(maxPath, 1 + dfs(matrix, nRow, nCol, memo));
26            }
27        }
28        memo[row][col] = maxPath;
29        return maxPath;
30    }
31}