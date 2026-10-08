// Last updated: 10/8/2026, 3:05:09 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count = 0;
4        for (int i = 0; i < grid.length; i++) {
5            for (int j = 0; j < grid[0].length; j++) {
6                if (grid[i][j] == '1') {
7                    dfs(grid, i, j);
8                    count++;
9                }
10            }
11        }
12        return count;
13    }
14
15    private void dfs(char[][] grid, int row, int col) {
16        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
17            return;
18        }
19        grid[row][col] = '0';
20        dfs(grid, row + 1, col);
21        dfs(grid, row - 1, col);
22        dfs(grid, row, col + 1);
23        dfs(grid, row, col - 1);
24    }
25}