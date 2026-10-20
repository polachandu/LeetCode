// Last updated: 10/19/2026, 6:25:05 PM
1class Solution {
2    public int maxSum(int[][] grid) {
3        int result = 0;
4        int[][] dirs = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 1 }, { 2, 0 }, { 2, 1 }, { 2, 2 } };
5        for (int i = 0; i + 2 < grid.length; i++) {
6            for (int j = 0; j + 2 < grid[0].length; j++) {
7                int row = i, col = j;
8                int calSum = 0;
9                for (int[] dir : dirs) {
10                    int calR = i + dir[0];
11                    int calC = j + dir[1];
12                    calSum += grid[calR][calC];
13                }
14                result = Math.max(result, calSum);
15            }
16
17        }
18        return result;
19    }
20}