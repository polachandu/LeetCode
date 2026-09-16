// Last updated: 9/16/2026, 12:26:58 PM
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
4        int[][] effort = new int[(heights.length)][(heights[0].length)];
5        for (int[] row : effort) {
6            Arrays.fill(row, Integer.MAX_VALUE);
7        }
8        effort[0][0] = 0;
9        minHeap.add(new int[] { 0, 0, 0 });
10
11        while (!minHeap.isEmpty()) {
12            int[] current = minHeap.poll();
13
14            int currentEffort = current[0], currentRow = current[1], currentCol = current[2];
15            if (currentRow == heights.length - 1 && currentCol == heights[0].length - 1) {
16                return currentEffort;
17            }
18            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
19            for (int[] dir : dirs) {
20                int newRow = currentRow + dir[0];
21                int newCol = currentCol + dir[1];
22                if (newRow < 0 || newRow >= heights.length || newCol < 0 || newCol >= heights[0].length) {
23                    continue;
24                }
25
26                int diff = Math.abs(heights[newRow][newCol] - heights[currentRow][currentCol]);
27                int newEffort = Math.max(currentEffort, diff);
28
29                if (newEffort < effort[newRow][newCol]) {
30                    effort[newRow][newCol] = newEffort;
31                    minHeap.add(new int[] { newEffort, newRow, newCol });
32                }
33            }
34        }
35        return effort[heights.length - 1][heights[0].length - 1];
36    }
37}