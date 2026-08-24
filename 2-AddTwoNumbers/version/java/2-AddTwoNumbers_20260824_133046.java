// Last updated: 8/24/2026, 1:30:46 PM
1class Solution {
2    public List<List<Integer>> pacificAtlantic(int[][] heights) {
3        int m = heights.length, n = heights[0].length;
4        Queue<int[]> pacQueue = new LinkedList();
5        Queue<int[]> atlQueue = new LinkedList();
6        boolean[][] pacific = new boolean[m][n];
7        boolean[][] atlantic = new boolean[m][n];
8
9        for (int i = 0; i < m; i++) {
10            pacific[i][0] = true;
11            pacQueue.add(new int[] { i, 0 });
12            atlantic[i][n - 1] = true;
13            atlQueue.add(new int[] { i, n - 1 });
14        }
15
16        for (int i = 0; i < n; i++) {
17            pacific[0][i] = true;
18            pacQueue.add(new int[] { 0, i });
19            atlantic[m - 1][i] = true;
20            atlQueue.add(new int[] { m - 1, i });
21        }
22
23        bfs(heights, pacQueue, pacific);
24        bfs(heights, atlQueue, atlantic);
25
26        List<List<Integer>> results = new ArrayList();
27
28        for (int i = 0; i < m; i++) {
29            for (int j = 0; j < n; j++) {
30                if (pacific[i][j] && atlantic[i][j]) {
31                    results.add(List.of(i, j));
32                }
33            }
34        }
35        return results;
36    }
37
38    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
39        int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
40        while (!queue.isEmpty()) {
41            int[] curr = queue.poll();
42            for (int[] dir : dirs) {
43                int nr = dir[0] + curr[0];
44                int nc = dir[1] + curr[1];
45                if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length
46                        && heights[nr][nc] >= heights[curr[0]][curr[1]] && !visited[nr][nc]) {
47                    visited[nr][nc] = true;
48                    queue.add(new int[] { nr, nc });
49                }
50            }
51        }
52    }
53}