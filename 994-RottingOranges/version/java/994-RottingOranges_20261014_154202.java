// Last updated: 10/14/2026, 3:42:02 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int time = 0;
4        int fresh = 0;
5        Queue<int[]> queue = new LinkedList();
6        for (int i = 0; i < grid.length; i++) {
7            for (int j = 0; j < grid[0].length; j++) {
8                if (grid[i][j] == 2) {
9                    queue.add(new int[] { i, j });
10                }
11                if (grid[i][j] == 1) {
12                    fresh++;
13                }
14            }
15        }
16        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
17        while (!queue.isEmpty() && fresh > 0) {
18            int size = queue.size();
19            for (int i = 0; i < size; i++) {
20                int[] curr = queue.poll();
21                for (int[] dir : dirs) {
22                    int neiX = curr[0] + dir[0];
23                    int neiY = curr[1] + dir[1];
24                    if (neiX < 0 || neiX >= grid.length || neiY < 0 || neiY >= grid[0].length) {
25                        continue;
26                    }
27                    if (grid[neiX][neiY] == 1) {
28                        grid[neiX][neiY] = 2;
29                        fresh--;
30                        queue.add(new int[] { neiX, neiY });
31                    }
32                }
33            }
34            time++;
35        }
36        return fresh > 0 ? -1 : time;
37    }
38}