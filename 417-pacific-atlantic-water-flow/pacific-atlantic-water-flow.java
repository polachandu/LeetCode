class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> results = new ArrayList();
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        Queue<int[]> pacQueue = new LinkedList();
        Queue<int[]> atlQueue = new LinkedList();

        for (int i = 0; i < m; i++) {
            pacific[i][0] = true;
            pacQueue.add(new int[] { i, 0 });
            atlantic[i][n - 1] = true;
            atlQueue.add(new int[] { i, n - 1 });
        }
        for (int j = 0; j < n; j++) {
            pacific[0][j] = true;
            pacQueue.add(new int[] { 0, j });
            atlantic[m - 1][j] = true;
            atlQueue.add(new int[] { m - 1, j });
        }

        bfs(heights, pacQueue, pacific);
        bfs(heights, atlQueue, atlantic);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    results.add(List.of(i, j));
                }
            }
        }
        return results;
    }

    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int nr = dir[0] + curr[0];
                int nc = dir[1] + curr[1];
                if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length
                        && heights[nr][nc] >= heights[curr[0]][curr[1]] && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.add(new int[] { nr, nc });
                }
            }
        }
    }
}