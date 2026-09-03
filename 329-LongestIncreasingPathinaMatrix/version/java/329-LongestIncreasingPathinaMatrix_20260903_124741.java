// Last updated: 9/3/2026, 12:47:41 PM
1class Solution {
2
3    public int numIslands(char[][] grid) {
4        int count = 0;
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[0].length; j++) {
7                if (grid[i][j] == '1') {
8                    dfs(grid, i, j);
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15
16    private void dfs(char[][] grid, int row, int col) {
17        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
18            return;
19        }
20
21        grid[row][col] = '0';
22        dfs(grid, row + 1, col);
23        dfs(grid, row - 1, col);
24        dfs(grid, row, col + 1);
25        dfs(grid, row, col - 1);
26
27    }
28}