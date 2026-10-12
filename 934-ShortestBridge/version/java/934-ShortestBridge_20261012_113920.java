// Last updated: 10/12/2026, 11:39:20 AM
1class Solution {
2    public int shortestBridge(int[][] grid) {
3        boolean found = false;
4        Queue<int[]> queue = new LinkedList();
5        for (int i = 0; i < grid.length && !found; i++) {
6            for (int j = 0; j < grid[0].length && !found; j++) {
7                if (grid[i][j] == 1) {
8                    dfs(grid, i, j, queue);
9                    found = true;
10                }
11            }
12        }
13        int steps = 0;
14        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
15        while (!queue.isEmpty()) {
16            int size = queue.size();
17            for (int i = 0; i < size; i++) {
18                int[] curr = queue.poll();
19                for (int[] dir : dirs) {
20                    int neiX = dir[0] + curr[0];
21                    int neiY = dir[1] + curr[1];
22                    if (neiX < 0 || neiX >= grid.length || neiY < 0 || neiY >= grid[0].length) {
23                        continue;
24                    }
25                    if (grid[neiX][neiY] == 1)
26                        return steps;
27                    if (grid[neiX][neiY] == 0) {
28                        grid[neiX][neiY] = -1;
29                        queue.add(new int[] { neiX, neiY });
30                    }
31                }
32            }
33            steps++;
34        }
35        return steps;
36    }
37
38    private void dfs(int[][] grid, int row, int col, Queue<int[]> queue) {
39        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
40            return;
41        }
42        if (grid[row][col] != 1  || grid[row][col] == 0) {
43            return;
44        }
45        grid[row][col] = -1;
46        queue.add(new int[] { row, col });
47        dfs(grid, row + 1, col, queue);
48        dfs(grid, row - 1, col, queue);
49        dfs(grid, row, col + 1, queue);
50        dfs(grid, row, col - 1, queue);
51    }
52}