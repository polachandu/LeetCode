// Last updated: 9/19/2026, 2:05:39 PM
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        int[][] efforts = new int[heights.length][heights[0].length];

        for (int[] row : efforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        efforts[0][0] = 0;
        minHeap.add(new int[] { 0, 0, 0 });

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentEffort = current[0], currentRow = current[1], currentCol = current[2];
            if (currentRow == heights.length - 1 && currentCol == heights[0].length - 1) {
                return currentEffort;
            }
            if (visited[currentRow][currentCol]) {
                continue;
            }
            visited[currentRow][currentCol] = true;
            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
            for (int[] dir : dirs) {
                int newRow = currentRow + dir[0];
                int newCol = currentCol + dir[1];

                if (newRow < 0 || newRow >= heights.length || newCol < 0 || newCol >= heights[0].length) {
                    continue;
                }

                int newEffort = Math.max((Math.abs(heights[newRow][newCol] - heights[currentRow][currentCol])),
                        currentEffort);
                if (newEffort < efforts[newRow][newCol]) {
                    efforts[newRow][newCol] = newEffort;
                    minHeap.add(new int[] { newEffort, newRow, newCol });
                }
            }
        }
        return efforts[heights.length - 1][heights[0].length - 1];
    }
}