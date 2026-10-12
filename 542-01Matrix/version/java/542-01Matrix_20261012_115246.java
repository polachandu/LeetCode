// Last updated: 10/12/2026, 11:52:46 AM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        Queue<int[]> queue = new LinkedList();
4        for (int i = 0; i < mat.length; i++) {
5            for (int j = 0; j < mat[0].length; j++) {
6                if (mat[i][j] == 0) {
7                    queue.add(new int[] { i, j });
8                }else{
9                    mat[i][j] = -1;
10                }
11            }
12        }
13        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
14        while (!queue.isEmpty()) {
15            int[] curr = queue.poll();
16            for (int[] dir : dirs) {
17                int neiX = curr[0] + dir[0];
18                int neiY = curr[1] + dir[1];
19                if (neiX < 0 || neiX >= mat.length || neiY < 0 || neiY >= mat[0].length) {
20                    continue;
21                }
22                if (mat[neiX][neiY] == -1) {
23                    mat[neiX][neiY] = mat[curr[0]][curr[1]] + 1;
24                    queue.add(new int[] { neiX, neiY });
25                }
26            }
27        }
28        return mat;
29    }
30}