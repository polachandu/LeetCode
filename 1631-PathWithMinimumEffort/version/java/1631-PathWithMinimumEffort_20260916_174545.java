// Last updated: 9/16/2026, 5:45:45 PM
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
4        boolean[][] visited = new boolean[heights.length][heights[0].length];
5        int[][] efforts = new int[heights.length][heights[0].length];
6
7        for (int[] row : efforts) {
8            Arrays.fill(row, Integer.MAX_VALUE);
9        }
10        efforts[0][0] = 0;
11        minHeap.add(new int[] { 0, 0, 0 });
12
13        while (!minHeap.isEmpty()) {
14            int[] current = minHeap.poll();
15            int currentEffort = current[0], currentRow = current[1], currentCol = current[2];
16            if (currentRow == heights.length - 1 && currentCol == heights[0].length - 1) {
17                return currentEffort;
18            }
19            if (visited[currentRow][currentCol]) {
20                continue;
21            }
22            visited[currentRow][currentCol] = true;
23            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
24            for (int[] dir : dirs) {
25                int newRow = currentRow + dir[0];
26                int newCol = currentCol + dir[1];
27
28                if (newRow < 0 || newRow >= heights.length || newCol < 0 || newCol >= heights[0].length) {
29                    continue;
30                }
31
32                int newEffort = Math.max((Math.abs(heights[newRow][newCol] - heights[currentRow][currentCol])),
33                        currentEffort);
34                if (newEffort < efforts[newRow][newCol]) {
35                    efforts[newRow][newCol] = newEffort;
36                    minHeap.add(new int[] { newEffort, newRow, newCol });
37                }
38            }
39        }
40        return efforts[heights.length - 1][heights[0].length - 1];
41    }
42}