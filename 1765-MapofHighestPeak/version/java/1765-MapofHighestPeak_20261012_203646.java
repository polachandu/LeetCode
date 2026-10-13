// Last updated: 10/12/2026, 8:36:46 PM
1class Solution {
2    public int[][] highestPeak(int[][] isWater) {
3        Queue<int[]> queue = new LinkedList<>();
4        boolean[][] visited = new boolean[isWater.length][isWater[0].length];
5        for (int i = 0; i < isWater.length; i++) {
6            for (int j = 0; j < isWater[0].length; j++) {
7                if (isWater[i][j] == 1) {
8                    isWater[i][j] = 0;
9                    visited[i][j] = true;
10                    queue.add(new int[] { i, j });
11                }
12            }
13        }
14        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
15        while (!queue.isEmpty()) {
16            int[] curr = queue.poll();
17            for (int[] dir : dirs) {
18                int neiX = curr[0] + dir[0];
19                int neiY = curr[1] + dir[1];
20                if (neiX < 0 || neiX >= isWater.length || neiY < 0 || neiY >= isWater[0].length) {
21                    continue;
22                }
23                if (visited[neiX][neiY]) {
24                    continue;
25                } else {
26                    visited[neiX][neiY] = true;
27                    isWater[neiX][neiY] = isWater[curr[0]][curr[1]] + 1;
28                    queue.add(new int[] { neiX, neiY });
29                }
30            }
31        }
32        return isWater;
33    }
34}