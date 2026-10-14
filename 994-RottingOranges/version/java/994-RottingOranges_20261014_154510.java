// Last updated: 10/14/2026, 3:45:10 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int fresh = 0;
4        Queue<int[]> queue = new LinkedList();
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[0].length; j++) {
7                if (grid[i][j] == 2) {
8                    queue.add(new int[] { i, j });
9                    grid[i][j] = 0;
10                }
11                if (grid[i][j] == 1) {
12                    fresh++;
13                }
14            }
15        }
16        int time = 0;
17        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
18        while (!queue.isEmpty() && fresh > 0) {
19            int size = queue.size();
20            for (int i = 0; i < size; i++) {
21                int[] curr = queue.poll();
22                for (int[] dir : dirs) {
23                    int neiX = curr[0] + dir[0];
24                    int neiY = curr[1] + dir[1];
25                    if (neiX < 0 || neiX >= grid.length || neiY < 0 || neiY >= grid[0].length) {
26                        continue;
27                    }
28                    if (grid[neiX][neiY] == 1) {
29                        grid[neiX][neiY] = 0;
30                        fresh--;
31                        queue.add(new int[] { neiX, neiY });
32                    }
33                }
34            }
35            time++;
36        }
37
38        return fresh > 0 ? -1 : time;
39    }
40}