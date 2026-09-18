// Last updated: 9/18/2026, 11:16:21 AM
1class Solution {
2    public int swimInWater(int[][] grid) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
4        int destRow = grid.length - 1;
5        int destCol = grid[0].length - 1;
6        int result = 0;
7
8        boolean[][] visited = new boolean[destRow + 1][destCol + 1];
9
10        minHeap.add(new int[] { 0, 0, grid[0][0] });
11
12        while (!minHeap.isEmpty()) {
13            int[] current = minHeap.poll();
14            int currentRow = current[0], currentCol = current[1], currentTime = current[2];
15            if (currentRow == destRow && currentCol == destCol) {
16                result = currentTime;
17                break;
18            }
19            if (visited[currentRow][currentCol]) {
20                continue;
21            }
22            visited[currentRow][currentCol] = true;
23
24            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
25            for (int[] dir : dirs) {
26                int neiRow = currentRow + dir[0];
27                int neiCol = currentCol + dir[1];
28                if (neiRow < 0 || neiRow >= grid.length || neiCol < 0 || neiCol >= grid[0].length) {
29                    continue;
30                }
31
32                minHeap.add(new int[] { neiRow, neiCol, Math.max(currentTime, grid[neiRow][neiCol]) });
33
34            }
35        }
36        return result;
37    }
38}