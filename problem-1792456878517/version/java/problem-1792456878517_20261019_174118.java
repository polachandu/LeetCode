// Last updated: 10/19/2026, 5:41:18 PM
1class Solution {
2    public boolean containsCycle(char[][] grid) {
3        boolean[][] visited = new boolean[grid.length][grid[0].length];
4        Queue<int[]> queue = new LinkedList();
5
6        for (int i = 0; i < grid.length; i++) {
7            for (int j = 0; j < grid[0].length; j++) {
8                if (visited[i][j]) {
9                    continue;
10                }
11                visited[i][j] = true;
12                queue.add(new int[] { i, j, -1, -1 });
13
14                int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
15                while (!queue.isEmpty()) {
16                    int[] curr = queue.poll();
17                    int r = curr[0], c = curr[1], pr = curr[2], pc = curr[3];
18                    for (int[] dir : dirs) {
19                        int nr = r + dir[0];
20                        int nc = c + dir[1];
21                        if (nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length) {
22                            continue;
23                        }
24                        if (nr == pr && nc == pc) {
25                            continue;
26                        }
27                        if (grid[r][c] != grid[nr][nc])
28                            continue;
29                        if (visited[nr][nc])
30                            return true;
31                        queue.add(new int[] { nr, nc, r, c });
32                        visited[nr][nc] = true;
33
34                    }
35                }
36            }
37        }
38        return false;
39    }
40}