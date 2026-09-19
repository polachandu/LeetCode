// Last updated: 9/19/2026, 2:07:01 PM
class Solution {
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        int destRow = grid.length - 1;
        int destCol = grid[0].length - 1;
        int result = 0;

        boolean[][] visited = new boolean[destRow + 1][destCol + 1];

        minHeap.add(new int[] { 0, 0, grid[0][0] });

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentRow = current[0], currentCol = current[1], currentTime = current[2];
            if (currentRow == destRow && currentCol == destCol) {
                result = currentTime;
                break;
            }
            if (visited[currentRow][currentCol]) {
                continue;
            }
            visited[currentRow][currentCol] = true;

            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
            for (int[] dir : dirs) {
                int neiRow = currentRow + dir[0];
                int neiCol = currentCol + dir[1];
                if (neiRow < 0 || neiRow >= grid.length || neiCol < 0 || neiCol >= grid[0].length) {
                    continue;
                }

                minHeap.add(new int[] { neiRow, neiCol, Math.max(currentTime, grid[neiRow][neiCol]) });

            }
        }
        return result;
    }
}