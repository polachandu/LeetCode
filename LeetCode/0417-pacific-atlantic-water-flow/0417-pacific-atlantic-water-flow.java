class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        Queue<int[]> pacQueue = new LinkedList();
        Queue<int[]> atlQueue = new LinkedList();

        for (int i = 0; i < m; i++) {
            pacQueue.add(new int[] { i, 0 });
            pacific[i][0] = true;
            atlQueue.add(new int[] { i, n - 1 });
            atlantic[i][n - 1] = true;
        }

        for (int j = 0; j < n; j++) {
            pacQueue.add(new int[] { 0, j });
            pacific[0][j] = true;
            atlQueue.add(new int[] { m - 1, j });
            atlantic[m - 1][j] = true;
        }

        bfs(heights, pacQueue, pacific);
        bfs(heights, atlQueue, atlantic);

        List<List<Integer>> results = new ArrayList();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    results.add(List.of(i, j));
                }
            }
        }
        return results;
    }

    public void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];
            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length && !visited[nr][nc]
                        && heights[nr][nc] >= heights[r][c]) {
                    visited[nr][nc] = true;
                    queue.add(new int[] { nr, nc });
                }
            }
        }
    }
}