// Last updated: 10/11/2026, 6:24:34 PM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        Queue<int[]> queue = new LinkedList();
4        for (int i = 0; i < mat.length; i++) {
5            for (int j = 0; j < mat[0].length; j++) {
6                if (mat[i][j] == 0) {
7                    queue.add(new int[] { i, j });
8                } else {
9                    mat[i][j] = -1;
10                }
11            }
12        }
13
14        while (!queue.isEmpty()) {
15            int[] curr = queue.poll();
16            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
17            for (int[] dir : dirs) {
18                int neiX = curr[0] + dir[0];
19                int neiY = curr[1] + dir[1];
20                if (neiX < 0 || neiX >= mat.length || neiY < 0 || neiY >= mat[0].length) {
21                    continue;
22                }
23                if (mat[neiX][neiY] == -1) {
24                    mat[neiX][neiY] = mat[curr[0]][curr[1]] + 1;
25                    queue.add(new int[] { neiX, neiY });
26                }
27            }
28        }
29        return mat;
30    }
31}