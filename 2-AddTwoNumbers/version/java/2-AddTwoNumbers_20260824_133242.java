// Last updated: 8/24/2026, 1:32:42 PM
1class Solution {
2    public List<List<Integer>> pacificAtlantic(int[][] heights) {
3        int m = heights.length;
4        int n = heights[0].length;
5
6        Queue<int[]> pacQueue = new LinkedList();
7        Queue<int[]> altQueue = new LinkedList();
8
9        boolean[][] pacific = new boolean[m][n];
10        boolean[][] atlantic = new boolean[m][n];
11
12        for (int i = 0; i < m; i++) {
13            pacific[i][0] = true;
14            pacQueue.add(new int[] { i, 0 });
15            atlantic[i][n - 1] = true;
16            altQueue.add(new int[] { i, n - 1 });
17        }
18
19        for (int i = 0; i < n; i++) {
20            pacific[0][i] = true;
21            pacQueue.add(new int[] { 0, i });
22            atlantic[m - 1][i] = true;
23            altQueue.add(new int[] { m - 1, i });
24        }
25
26        bfs(heights, pacific, pacQueue);
27        bfs(heights, atlantic, altQueue);
28
29        List<List<Integer>> results = new ArrayList();
30
31        for (int i = 0; i < m; i++) {
32            for (int j = 0; j < n; j++) {
33                if (pacific[i][j] && atlantic[i][j]) {
34                    results.add(List.of(i, j));
35                }
36            }
37        }
38        return results;
39    }
40
41    private void bfs(int[][] heights, boolean[][] visited, Queue<int[]> queue) {
42        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
43        while (!queue.isEmpty()) {
44            int[] current = queue.poll();
45            for (int[] dir : dirs) {
46                int nr = current[0] + dir[0];
47                int nc = current[1] + dir[1];
48                if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length
49                        && heights[nr][nc] >= heights[current[0]][current[1]] && !visited[nr][nc]) {
50                    visited[nr][nc] = true;
51                    queue.add(new int[] { nr, nc });
52                }
53            }
54        }
55    }
56}