// Last updated: 9/16/2026, 12:37:02 PM
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
4        boolean[][] visited = new boolean[heights.length][heights[0].length];
5        int[][] effort = new int[(heights.length)][(heights[0].length)];
6
7        for (int[] row : effort) {
8            Arrays.fill(row, Integer.MAX_VALUE);
9        }
10        effort[0][0] = 0;
11        minHeap.add(new int[] { 0, 0, 0 });
12
13        while (!minHeap.isEmpty()) {
14            int[] current = minHeap.poll();
15
16            int currentEffort = current[0], currentRow = current[1], currentCol = current[2];
17            if (currentRow == heights.length - 1 && currentCol == heights[0].length - 1) {
18                return currentEffort;
19            }
20            if (visited[currentRow][currentCol]) {
21                continue;
22            }
23            visited[currentRow][currentCol] = true;
24            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
25            for (int[] dir : dirs) {
26                int newRow = currentRow + dir[0];
27                int newCol = currentCol + dir[1];
28                if (newRow < 0 || newRow >= heights.length || newCol < 0 || newCol >= heights[0].length) {
29                    continue;
30                }
31
32                int diff = Math.abs(heights[newRow][newCol] - heights[currentRow][currentCol]);
33                int newEffort = Math.max(currentEffort, diff);
34
35                if (newEffort < effort[newRow][newCol]) {
36                    effort[newRow][newCol] = newEffort;
37                    minHeap.add(new int[] { newEffort, newRow, newCol });
38                }
39            }
40        }
41        return effort[heights.length - 1][heights[0].length - 1];
42    }
43}