// Last updated: 9/5/2026, 12:33:54 PM
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] memo = new int[m][n];
        int maxPath = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPath = Math.max(maxPath, dfs(matrix, i, j, memo));
            }
        }
        return maxPath;
    }

    private int dfs(int[][] matrix, int row, int col, int[][] memo) {
        if (memo[row][col] != 0)
            return memo[row][col];

        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int maxPath = 1;
        for (int[] dir : dirs) {
            int nRow = dir[0] + row;
            int nCol = dir[1] + col;
            if (nRow >= 0 && nRow < matrix.length && nCol >= 0 && nCol < matrix[0].length
                    && matrix[nRow][nCol] > matrix[row][col]) {
                maxPath = Math.max(maxPath, 1 + dfs(matrix, nRow, nCol, memo));
            }
        }
        memo[row][col] = maxPath;
        return maxPath;
    }
}